package com.ECL.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ECL.Domain.Employee;
import com.ECL.Repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Employee findEmployee(Long id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
