package com.service;

import java.util.List;

import com.dto.EmployeeDTO;

public interface EmployeeService {

	EmployeeDTO authenticate(String emailId, String password);

	List<EmployeeDTO> getAllEmployee();

	String saveEmployee(EmployeeDTO employeeDTO);

	

	void deleteEmployee(int employeeId);

	

}
