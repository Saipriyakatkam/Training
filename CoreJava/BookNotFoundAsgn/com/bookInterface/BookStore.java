package com.bookInterface;

import com.book.Book;

public interface BookStore {

	abstract public Book[] getbooks();
	abstract public Book findBookById(Book [] books,long id);
	abstract public Book findBookByName(Book []books , String name);
	abstract public Book updateBook(Book []books, long ID,double price);
	public default void display(Book[] books)
	{
		for(Book b:books)
			System.out.println(b);
	}
}
