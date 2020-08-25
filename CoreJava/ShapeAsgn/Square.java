
public class Square extends Shape {

	private double side;

	public Square()
	{
		
	}
	
	public Square(double side) {
		super("Square");
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	public double area()
	{
		return side*side*side*side;
	}
	public double perimeter()
	{
		return 4*side;
		
	}
	
}
