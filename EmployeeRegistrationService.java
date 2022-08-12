package com.example.demo.service;

import com.example.demo.model.EmployeeModel;
import com.example.demo.model.LoginEmployee;

public interface EmployeeRegistrationService {
	public String saveEmployeeRegistration(EmployeeModel employeeModel);
	
	public String loginEmployee(LoginEmployee loginEmployee);

}
