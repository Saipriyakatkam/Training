package com.io;

import com.pojo.Employee;

public interface EmployeeOperation {

	abstract public boolean addEmployee(Employee employee);
	abstract public Employee updateEmployee(int id, String name);
	abstract public Employee deleteEmployee(int id);
	abstract public Employee findEmployeeById(int id);
	abstract public void findAllEmployees();
	
}
