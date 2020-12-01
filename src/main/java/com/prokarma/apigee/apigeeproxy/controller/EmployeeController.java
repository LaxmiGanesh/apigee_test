package com.prokarma.apigee.apigeeproxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prokarma.apigee.apigeeproxy.domain.Empoyee;

@RestController
@RequestMapping("apigee/test")
public class EmployeeController {
	
	@GetMapping("/employee")
	public Empoyee getEmployee() {
		
		return new Empoyee("Ganesh","Reddi",79820.00f,54351l,"Senior Software Engineer");
	}
}
