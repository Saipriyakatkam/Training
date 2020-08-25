
public class Book {

	private long bIsbn;
	private String name;
	private double price;
	private String publication;
	private String author;
	public Book()
	{
		
	}
	public Book(long bIsbn,String name,double price)
	{
		this.bIsbn=bIsbn;
		this.name=name;
		this.price=price;
	}
	public Book(long bIsbn,String name,String publication,String author)
	{

		this.bIsbn=bIsbn;
		this.name=name;
		this.publication=publication;
		this.author=author;
	}

	
	public long getbIsbn() {
		return bIsbn;
	}
	public void setbIsbn(long bIsbn) {
		this.bIsbn = bIsbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
