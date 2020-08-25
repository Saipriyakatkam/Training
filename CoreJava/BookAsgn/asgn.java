
public class asgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore bookstore=new BookStore();
		Book books[]=bookstore.getbooks();
		
		bookstore.display();
		
		Book b=bookstore.findBookById(12345);
		if(b==null)
		System.out.println("Book Not Found");
		else
		System.out.println("BookISBN = "+b.getbIsbn()+"Book Name = "+b.getName());
		
		b =bookstore.updateBook(12345, 350.00);
		if(b==null)
			System.out.println("Book Not Found");
		else
			
			System.out.println("BookISBN = "+b.getbIsbn()+"Book Name = "+b.getName()+"Book Price = "+b.getPrice());
					
	}

}
