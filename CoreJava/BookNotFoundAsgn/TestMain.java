import java.util.Scanner;

import com.book.Book;
import com.bookInterface.BookStoreImpl;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStoreImpl bs=new BookStoreImpl();
		Book books[]=bs.getbooks();
		Book b=new Book();
		int choice,bookid;
		double price;
		String bookname;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("===============MENU=============");
		System.out.println("1.FIND BOOK BY ID");
		System.out.println("2.FIND BOOK BY NAME");
		System.out.println("3.UPDATE BOOK PRICE");
		System.out.println("4.DISPLAY ALL BOOKS");
		System.out.println("5.STOP");
		
		System.out.println("Enter Choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Book Id to be finded");
			bookid=sc.nextInt();
			
			b=bs.findBookById(books, bookid);
			if(b!=null)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println("not Found");
			}
			break;
		case 2:
			System.out.println("Enter Book Name to be finded");
			bookname=sc.next();
			
			b=bs.findBookByName(books, bookname);
			if(b!=null)
			{
				System.out.println(b);
			}
			break;
		case 3:
			System.out.println("Enter Id and Price of book to be updated");
			System.out.println("ID:");
			bookid=sc.nextInt();
			System.out.println("Price:");
			price=sc.nextDouble();
			
			b=bs.updateBook(books,bookid, price);
			if(b!=null)
			{
				System.out.println(b);
			}
			break;
			
		case 4:
			System.out.println("Displaying books");
			bs.display(books);
			break;
		case 5:System.out.println("Thankyou");
			choice=5;
			break;
			
		}
		}while(choice!=5);
		
	}

}
