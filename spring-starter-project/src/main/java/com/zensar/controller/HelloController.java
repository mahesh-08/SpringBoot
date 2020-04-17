package com.zensar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Employee;

@RestController
public class HelloController {
	
	//http://localhost:8080/
	
	@RequestMapping("/")
	public String sayHello() {
		return "<h1> Hello </h1>";
	}
	
	//http://localhost:8080/employee
	
	@RequestMapping("/employee")
	public Employee getEmployee() {
		return new Employee(1001, "Ram", 20000);
	}

}
