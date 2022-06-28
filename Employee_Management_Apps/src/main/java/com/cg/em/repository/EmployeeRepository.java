package com.cg.em.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.em.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
