package com.bookInterface;

import java.util.Scanner;

import com.book.Book;
import com.bookexception.BookNotFoundException;

public class BookStoreImpl implements BookStore {

	@Override
	public Book[] getbooks() {
		// TODO Auto-generated method stub
		Book[] books=new Book[3];
		Scanner scan=new Scanner(System.in);
		long bIsbn;
		String name;
		double price;
		String publication;
		String author;
		
		
		for(int i=0;i<3;i++)
		{
		System.out.println("Enter Book Details");
		System.out.println("Enter Book ISBN");
		bIsbn=scan.nextInt();
		
		System.out.println("Enter Book Name");
		name=scan.next();
		
		System.out.println("Enter Book Price");
		price=scan.nextDouble();
		
		System.out.println("Enter Book publication");
		publication=scan.next();
		
		System.out.println("Enter Book Author");
		author=scan.next();
		
	//	books[i]=new Book(bIsbn, name, price);
		books[i]=new Book(bIsbn, name, price,publication, author);
		}
		
		return books;
	}
	/*public Book[] getbooks()
	{
		Book[] books=new Book[4];
		books[0]=new Book(12345,"WingsOfFire",500.00);
		books[1]=new Book(23456,"An Autobiography",450.98);
		books[2]=new Book(34567,"TheWordsofGandhi",560.87);
		books[3]=new Book(45678,"Sherlock",250.98);
		//this.books=books;
		return books;
	}*/

	@Override
	public Book findBookById(Book[] books, long id) {
		// TODO Auto-generated method stub
		BookNotFoundException be=new BookNotFoundException();
		
		for(Book b:books)
		{
			if(b.getbIsbn()==id){
				return b;
			}
		}
		be.checkException();
		return null;
		
	}

	@Override
	public Book findBookByName(Book[] books, String name) {
		// TODO Auto-generated method stub
BookNotFoundException be=new BookNotFoundException();
		
		for(Book b:books)
		{
			if(b.getName().equalsIgnoreCase(name))
				return b;
		}
		be.checkException();
		return null;
	}

	@Override
	public Book updateBook(Book[] books, long ID, double price) {
		// TODO Auto-generated method stub
		Book b;
		b=findBookById(books, ID);
		if(b!=null)
		{
			b.setPrice(price);
			return b;
		}
		return null;
	}

}
