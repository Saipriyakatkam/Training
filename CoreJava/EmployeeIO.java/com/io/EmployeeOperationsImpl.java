package com.io;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class EmployeeOperationsImpl implements EmployeeOperation {

	@Override
	public boolean addEmployee(Employee employee) {
		
		// TODO Auto-generated method stub
		EmpIOImpl e=new EmpIOImpl();
		List <Employee> list=new ArrayList<Employee>();
		list=e.readFromFile();
		list.add(employee);
		e.addToFile(list);
		for(Employee p:list )
		{
			if(p.getEmpId()==employee.getEmpId())
			{
				System.out.println(p);
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		EmpIOImpl e=new EmpIOImpl();
		List <Employee> list;
		list=e.readFromFile();
		for(Employee p:list )
		{
			if(p.getEmpId()==id)
			{
				p.setEmpName(name);
				e.addToFile(list);
				return p;
			}
			//System.out.println(p);
		}
		return null;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Employee emp=findEmployeeById(id);
		EmpIOImpl e=new EmpIOImpl();
		List <Employee> list;
		list=e.readFromFile();
		for(Employee p:list )
		{
			if(p.getEmpId()==id)
			{
				emp=p;
				list.remove(p);
				e.addToFile(list);
				return emp;
			}
			//System.out.println(p);
		}
		return null;
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		EmpIOImpl e=new EmpIOImpl();
		List <Employee> list;
		list=e.readFromFile();
		for(Employee p:list )
		{
			if(p.getEmpId()==id)
				return p;
			//System.out.println(p);
		}
		return null;
	}

	@Override
	public void findAllEmployees() {
		// TODO Auto-generated method stub
		EmpIOImpl e=new EmpIOImpl();
		List <Employee> l;
		l=e.readFromFile();
		l.forEach((p)->{
			System.out.println(p);
		});
		return ;
	}

}
