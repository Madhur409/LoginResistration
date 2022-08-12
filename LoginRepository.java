package com.example.demo.employeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LoginEmployeeEntity;
@Repository
public interface LoginRepository extends JpaRepository<LoginEmployeeEntity, Integer>{

}
