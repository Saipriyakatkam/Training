
public class BookStore {

	Book[] books;
	Book[] getbooks()
	{
		Book[] books=new Book[4];
		books[0]=new Book(12345,"WingsOfFire",500.00);
		books[1]=new Book(23456,"An Autobiography",450.98);
		books[2]=new Book(34567,"TheWordsofGandhi",560.87);
		books[3]=new Book(45678,"Sherlock",250.98);
		this.books=books;
		return books;
	}
	Book findBookById(long id)
	{
		for(Book b:books)
		{
			if(b.getbIsbn()==id)
			{
				return b;
			}
		}
		return null;
	}
	Book updateBook(long ID,double price)
	{
		Book b=findBookById(ID);
		if(b!=null){
			b.setPrice(price);
			return b;
		}
		else
			return null;
	}
	void display()
	{
		for(Book b:books)
		{
		System.out.println("BookISBN = "+b.getbIsbn());
		System.out.println("Book Name = "+b.getName());
		System.out.println("Book Price = "+b.getPrice());
		System.out.println("Book Author = "+b.getAuthor());
		System.out.println("Book Publication = "+b.getPublication());
		
		}
	}
	
}
