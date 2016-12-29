package com.ECL.Service;

import java.util.List;

import com.ECL.Domain.Employee;

public interface EmployeeService {

	public abstract void deleteEmployee(Employee employee);
	
	public abstract Employee findEmployee(Long id);

	public abstract List<Employee> findAllEmployees();

	public abstract Employee saveEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);
	
}
