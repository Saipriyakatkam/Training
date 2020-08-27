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


	
	public static void checkException(String m)
	{
				try {
					throw new PersonNotfoundException(m);
				} catch (PersonNotfoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
	}
}

