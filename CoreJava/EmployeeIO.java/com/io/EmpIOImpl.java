package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Address;
import com.pojo.Employee;


public class EmpIOImpl implements EmpIO {

	
	@Override
	public void addToFile(List<Employee> employees) {
		// TODO Auto-generated method stub
		try (
				FileOutputStream fo=new FileOutputStream("employee.txt");
				ObjectOutputStream oo=new ObjectOutputStream(fo);)
			{
			
			  oo.writeObject(employees);	
			  
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	@Override
	public List<Employee> readFromFile() {
		// TODO Auto-generated method stub
		List<Employee> l=new ArrayList<Employee>();
		try
		{
			FileInputStream fi = new FileInputStream("employee.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);	
			
			
			l=(ArrayList)oi.readObject();
			fi.close();
			oi.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public Employee readFromUser() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id;
		String name,c,s,p;
		System.out.println("Enter Employee Details");
		System.out.println("Enter Employee id");
		id=sc.nextInt();
		System.out.println("Enter Employee Name");
		name=sc.next();
		System.out.println("Enter City");
		c=sc.next();
		System.out.println("Enter state");
		s=sc.next();
		System.out.println("Enter Pincode");
		p=sc.next();
		
		Address add=new Address(c,s,p);
		Employee emp=new Employee(id,name,add);
		
		return emp;
	}

	@Override
	public void displayToUser(Employee emp) {
		// TODO Auto-generated method stub

		System.out.println(emp);
	}

}
