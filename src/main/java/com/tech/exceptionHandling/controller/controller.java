package com.tech.exceptionHandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.exceptionHandling.model.dto.employeeDto;
import com.tech.exceptionHandling.service.EmployeeServiceInterface;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("employee")
public class controller {
	
	@Autowired
	private EmployeeServiceInterface EmpService;
     
	@PostMapping("create")
	public employeeDto postMethodName(@Valid @RequestBody employeeDto entity) {
		//TODO: process POST request
		return EmpService.createEmployee(entity);
	}
	
}
