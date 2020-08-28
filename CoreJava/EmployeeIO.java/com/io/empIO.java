package com.io;

import java.util.List;

import com.pojo.*;
public interface EmpIO {

	abstract public  void addToFile(List<Employee>employees);//add the data to employee.txt ==serialization
	abstract public  List<Employee> readFromFile();  // read the data from employee.txt == deserialization
	abstract public  Employee readFromUser(); //take input from user via standatdIO
	abstract public  void displayToUser(Employee emp); //display data to console

}
