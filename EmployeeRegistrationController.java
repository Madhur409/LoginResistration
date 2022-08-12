package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeModel;
import com.example.demo.model.LoginEmployee;
import com.example.demo.service.EmployeeRegistrationService;
@RestController
public class EmployeeRegistrationController {
	@Autowired
	EmployeeRegistrationService employeeRegistrationService;
	@PostMapping("/employeeRegistration")
	public ResponseEntity<String> saveEmployeeRegistration(@RequestBody EmployeeModel employeeModel) {
	String response=employeeRegistrationService.saveEmployeeRegistration(employeeModel);
	ResponseEntity<String> responseEntity=new ResponseEntity<String>(response,HttpStatus.OK);
	return responseEntity;	
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginEmployee(@RequestBody LoginEmployee loginEmployee) {
	String response=employeeRegistrationService.loginEmployee(loginEmployee);
	ResponseEntity<String> responseEntit=new ResponseEntity<String>(response,HttpStatus.OK);
	return responseEntit;	
	}

}
