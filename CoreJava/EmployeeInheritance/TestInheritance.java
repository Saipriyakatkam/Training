
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//WageEmployee w=new WageEmployee();
		//w.display();
		//WageEmployee w1=new WageEmployee(400,"Sai",300,9);
		//w1.display();
		
		SalariedEmployee ts=new SalariedEmployee(2003,"Riya",200,30.67,67.89);
		ts.display();
		System.out.println("total Salary= "+ts.totalSalary());
	
		Employee e=new Employee();
		e.display();
	}

}
