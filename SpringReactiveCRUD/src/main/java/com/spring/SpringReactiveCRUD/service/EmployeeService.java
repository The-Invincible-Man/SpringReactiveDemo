package com.spring.SpringReactiveCRUD.service;

import com.spring.SpringReactiveCRUD.model.Employee;
import com.spring.SpringReactiveCRUD.repository.EmployeeCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class EmployeeService {

    @Autowired
    EmployeeCRUDRepository employeeCRUDRepository;

    public Flux<Employee> getAllEmployeeDetails(){
        Flux<Employee> employeeFlux = employeeCRUDRepository.findAll();
        return employeeFlux.delayElements(Duration.ofSeconds(3));

    }

    public Flux<Employee> getAllEmployeeDetailsAgeGreater20(){
        Flux<Employee> employeeFlux = employeeCRUDRepository.findAll();
        return employeeFlux.delayElements(Duration.ofSeconds(3)).filter(x->x.getAge()>20).map(x->{x.setName(x.getName().toUpperCase()); return x;});
    }

    public Mono<Employee> add (Employee employee){
        return employeeCRUDRepository.save(employee);
    }

    public Mono<Void> deleteById(int id){
        return employeeCRUDRepository.deleteById(id);
    }

    public Mono<Employee> update(int id, String emailId){
        Mono<Employee> emp = employeeCRUDRepository.findById(id);
        return emp.map(x -> {x.setEmailId(emailId); return x;}).flatMap(employeeCRUDRepository::save);
    }
}
