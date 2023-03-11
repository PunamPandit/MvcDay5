package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.entity.EmployeeEntity;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public EmployeeEntity authenticate(String emailId, String password) {
		EmployeeEntity employeeEntity=null;
		
		String sql="select * from employee where emailId=? and password=?";
		Object[] data= {emailId,password};
		
		try {
		employeeEntity=jdbcTemplate.queryForObject(sql, data, new BeanPropertyRowMapper<>(EmployeeEntity.class));
		}catch(Exception e) {
			e.printStackTrace();
		}
				
		return employeeEntity;
	}

	@Override
	public List<EmployeeEntity> getAllEmployee() {
		 List<EmployeeEntity> employee =jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper(EmployeeEntity.class));
			
         return employee; // number of records
	
	
	}

	@Override
	public String saveEmployee(EmployeeEntity employeeEntity) {
		Object[] data = new Object [] {employeeEntity.getEmployeeId(),employeeEntity.getEmployeename(),employeeEntity.getSalary(),employeeEntity.getEmailId(),employeeEntity.getPassword()};
		int rowCount=jdbcTemplate.update("insert into employee (employeeId,employeeName,Salary,emailId,password)values(?,?,?,?,?)",data);
		
				
		
		return rowCount > 0?"One record inserted successfully":"Record not Inserted";
	}

	public void deleteEmployee(int employeeId) {
		jdbcTemplate.update("delete from employee where employeeid=?",employeeId);
		
		
	}
	
	
	

}
