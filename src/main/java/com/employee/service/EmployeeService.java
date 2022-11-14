package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return repository.findAll();
	}
	
	public Optional<Employee> findByID(int empid){
		return repository.findById(empid);
	}
	
	public void deleteEmployee(int empid) {
		repository.deleteById(empid);
	}

}
