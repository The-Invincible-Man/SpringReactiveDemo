package com.spring.SpringReactiveCRUD.controller;

import com.spring.SpringReactiveCRUD.model.Employee;
import com.spring.SpringReactiveCRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class EmployeeApiController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Employee> fetchAllEmployeeDeatils(){
        return employeeService.getAllEmployeeDetails();
    }

    @PostMapping("/addemployee")
    public Mono<Employee> addEmployee(@RequestBody Employee employee)
    {
        return employeeService.add(employee);
    }

    @DeleteMapping("/removeemployee/{id}")
    public Mono<Void> deleteEmployee(@PathVariable("id") int id){
        return employeeService.deleteById(id);
    }

    @GetMapping(value = "/getAllEmployeeDetailsAgeGreater20", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Employee> fetchAllEmployeeDetailsAgeGreater20(){

        return employeeService.getAllEmployeeDetailsAgeGreater20();
    }

    @PutMapping("/updateEmployeeEmail/{id}/{emailId}")
    public Mono<Employee> deleteEmployee (@PathVariable("id") int id,@PathVariable("emailId") String emailId){
        return employeeService.update(id,emailId);
    }

}
