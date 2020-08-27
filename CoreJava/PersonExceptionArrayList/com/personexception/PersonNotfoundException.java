package com.personexception;


import com.pojo.*;
public class PersonNotfoundException extends Exception{

	private String message;

	public PersonNotfoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonNotfoundException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


	
	public static void checkException()
	{
				try {
					throw new PersonNotfoundException("Person Not Found");
				} catch (PersonNotfoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
	}
}
