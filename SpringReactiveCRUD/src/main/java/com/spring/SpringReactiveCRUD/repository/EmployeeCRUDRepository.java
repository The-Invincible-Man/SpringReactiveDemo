package com.spring.SpringReactiveCRUD.repository;

import com.spring.SpringReactiveCRUD.model.Employee;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCRUDRepository extends R2dbcRepository<Employee,Integer> {
}
