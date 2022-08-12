package com.example.demo.employeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeEntity;
@Repository
public interface EmployeeRegistratioRepository extends JpaRepository<EmployeeEntity, Integer>{

}
