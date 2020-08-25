
public class Rectangle extends Shape {

	private double length,breadth;

	public Rectangle()
	{
		
	}
	
	public Rectangle(double length, double breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double area()
	{
		return getLength()*getBreadth();
	}
	public double perimeter()
	{
		return 2*(getLength()+getBreadth());
		
	}
	
}
