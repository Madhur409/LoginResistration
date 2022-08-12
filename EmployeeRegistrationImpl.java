package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employeeRepository.EmployeeRegistratioRepository;
import com.example.demo.employeeRepository.LoginRepository;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.LoginEmployeeEntity;
import com.example.demo.model.EmployeeModel;
import com.example.demo.model.LoginEmployee;
import com.example.demo.service.EmployeeRegistrationService;

@Service
public class EmployeeRegistrationImpl implements EmployeeRegistrationService {
	@Autowired
	EmployeeRegistratioRepository employeeRegistratioRepository;
	@Autowired
	LoginRepository loginRepository;

	@Override
	public String saveEmployeeRegistration(EmployeeModel employeeModel) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		// employeeEntity.setEmployeeId(employeeModel.getEmployeeId());
		employeeEntity.setEmployeeFirstName(employeeModel.getEmployeeFirstName());
		employeeEntity.setEmployeeAddress(employeeModel.getEmployeeAddress());
		employeeEntity.setEmployeeEmail(employeeModel.getEmployeeEmail());
		employeeEntity.setEmployeePhoneNumber(employeeModel.getEmployeePhoneNumber());
		employeeRegistratioRepository.save(employeeEntity);
		String response = "empioyee registation successfuly";
		return response;
	}

	@Override
	public String loginEmployee(LoginEmployee loginEmployee) {
		LoginEmployeeEntity loginEmployeeEntity = new LoginEmployeeEntity();
		loginEmployeeEntity.setUserName(loginEmployee.getUserName());
		loginEmployeeEntity.setPassWord(loginEmployee.getPassWord());
		loginRepository.save(loginEmployeeEntity);

		String respon = "login successfuly";

		return respon;
	}

}
