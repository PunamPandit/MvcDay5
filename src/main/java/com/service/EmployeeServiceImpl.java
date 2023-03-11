package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;

	public EmployeeDTO authenticate(String emailId, String password) {
		EmployeeEntity employeeEntity=employeeDao.authenticate(emailId,password);
		EmployeeDTO employeeDTO=new EmployeeDTO();
		
		//copy data from employeeEntity to employeeDTO so that Controller may use it
		BeanUtils.copyProperties(employeeEntity, employeeDTO);
		
		
		
		return employeeDTO;
	}

	@Autowired
	EmployeeService employeeService;
	

	
	public List<EmployeeDTO> getAllEmployee() {
		
			List<EmployeeDTO> employeeDTO=new ArrayList<EmployeeDTO>();
			 List<EmployeeEntity>  employeeEntity    =employeeDao.getAllEmployee();   //employee
			
			 for(EmployeeEntity tempa : employeeEntity) {
				EmployeeDTO dto=new EmployeeDTO();
				 BeanUtils.copyProperties(tempa,dto);//data are going to be copied from the object of EmployeeEntity to EmployeeDTO
				 employeeDTO.add(dto);//record are going to be added one by one in dto
			 }
			
			
			return employeeDTO;  //collection of so many dto
		}



	@Override
	public String saveEmployee(EmployeeDTO employeeDTO) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		
		return employeeDao.saveEmployee(employeeEntity);
	}



	@Override
	public void deleteEmployee(int employeeId) {
		employeeDao.deleteEmployee(employeeId);
		
	}



	
	
	
}	


