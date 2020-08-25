public class Employee {

	private int empId;
	private String empName;
	public Employee()
	{
		System.out.println("Emp");
		empId=2098;
		empName="Priya";

	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public void display()
	{
		System.out.println("Id = "+empId+"\t"+"Emp Name ="+empName);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	}
