
 public class MyData {

	private int id;
	private String name;
	static private int count;
	{
		System.out.println("Object Block");
	}
	static
	{
		System.out.println("static Block");
		count=0;
	}
	public MyData()
	{
		System.out.println("Constructor");
		this.id=10;
		this.name="Priya";
		count++;
	}
	public MyData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		count++;
	}
	
	public void display()
	{
		System.out.println("Name = "+name+"\t"+"id = "+id+"\t"+"Count = "+count);
	}
	static public void displayS()
	{
		System.out.println("Count = "+count);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
