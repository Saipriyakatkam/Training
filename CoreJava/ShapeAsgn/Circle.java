
public class Circle extends Shape {

	private double radius;

	public Circle()
	{
		
	}
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area()
	{
		return 3.14*getRadius()*getRadius();
	}
	public double perimeter()
	{
		return 2*3.14*getRadius();
		
	}
	
}
