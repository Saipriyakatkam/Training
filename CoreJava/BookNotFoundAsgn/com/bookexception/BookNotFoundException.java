package com.bookexception;

import com.book.Book;

public class BookNotFoundException extends Exception {

	private String message;
	public BookNotFoundException()
	{
		
	}
	
	public BookNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public void checkException()
	{
				try {
					throw new BookNotFoundException("Book Not Found");
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
	}
	
}
