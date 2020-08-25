
public class SalariedEmployee extends Employee{


	long salary;
	double incentives;
	double ta;
	public SalariedEmployee()
	{
		
	}
	
	public SalariedEmployee(int empId,String empName, long salary, double incentives, double ta) {
		super(empId, empName);
		this.salary = salary;
		this.incentives = incentives;
		this.ta = ta;
	}
	
	public void display()
	{
		super.display();
		System.out.println("salary = "+salary+"\t"+
				"Incentives = "+incentives+"\t"
				+"Travel Allowance = "+ta);
	}
	public double totalSalary()
	{
		return (double)getSalary()+getIncentives()+getTa();
		
	}

	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public double getIncentives() {
		return incentives;
	}
	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	
	
}

