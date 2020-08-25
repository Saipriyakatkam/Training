
public class Shape implements Calulatable {

	private String name;
	
	public Shape()
	{
		
	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		

}
