package com.tech.exceptionHandling.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tech.exceptionHandling.model.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Long>{

}
