package com.cg.em.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.em.entity.Employee;
import com.cg.em.repository.EmployeeRepository;

@Controller
@RequestMapping("/api/v1")
public class EmployeeController {
    
	@Autowired
	private EmployeeRepository empRepository;
	
	@GetMapping(value= "/employee")
	public List<Employee> getAllStudents(){
		
		return empRepository.findAll();
		
	}
	
	@PostMapping(value = "/employee")
	public String createEmployee(@RequestBody Employee emp) {
		
		Employee insertedemployee = empRepository.insert(emp);
		
		return "Employee created"+ insertedemployee.getName();
	}
	
	@PutMapping("/updateEmployee")
	  public Employee updateEmployee(@RequestBody Employee emp) {
		
		empRepository.save(emp);
		return emp;
	  }
	
	 
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Employee id){
	empRepository.delete(id);
	
    }
}
