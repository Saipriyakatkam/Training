
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Circle(10);
		System.out.println("Shape = "+s.getName());
		System.out.println("Area =" +s.area());
		System.out.println("Perimeter = "+s.perimeter());
		s=new Rectangle(15,20);
		System.out.println("Shape = "+s.getName());
		System.out.println("Area =" +s.area());
		System.out.println("Perimeter = "+s.perimeter());
		
		s=new Square(20);
		System.out.println("Shape = "+s.getName());
		System.out.println("Area =" +s.area());
		System.out.println("Perimeter = "+s.perimeter());
		
	}

}
