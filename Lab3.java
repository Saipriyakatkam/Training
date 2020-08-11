import java.util.Scanner;

class Emp
{
	private int empno;
	private String ename;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
class EmpManager
{
	int count=10,i=0;
	Emp[] e = new Emp[count];
	public void create(Emp e1)
	{
		
		if(i<count)
		{
			e[i]=new Emp();
			e[i].setEmpno(e1.getEmpno());
			e[i].setEname(e1.getEname());
			e[i].setSalary(e1.getSalary());
			i++;
		}
	}
	public void update(int itemno,Emp ei)
	{
		for(int j=0;j<i;j++)
		{
			if(itemno==e[j].getEmpno())
			{
				e[j].setEmpno(ei.getEmpno());
				e[j].setEname(ei.getEname());
				e[j].setSalary(ei.getSalary());
				break;
			}
		}
	}
	public void delete(int del)
	{
		int k;
		for(int j=0;j<i;j++)
		{
			if(del==e[j].getEmpno())
			{
				for( k=j;k<i-1;k++)
				{
					e[k].setEmpno(e[k+1].getEmpno());
					e[k].setEname(e[k+1].getEname());
					e[k].setSalary(e[k+1].getSalary());
				}
				e[k].setEmpno(0);
				e[k].setEname(null);
				e[k].setSalary(0.0);
				i--;
			}
		}
	}
	public void print()
	{
		System.out.println("Printing ELements in array");
		for(int j=0;j<i;j++)
		{
			System.out.println("Employee Number "+j+" = "+ e[j].getEmpno() );
			System.out.println("Employee Name "+j+" = "+e[j].getEname());
			System.out.println("Employee Salary "+j+" = "+e[j].getSalary());
		}
	}
}
public class Lab3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		EmpManager em=new EmpManager();
		//Creating
		em.create(details());
		em.create(details());
		em.create(details());
		em.print();
		System.out.println("Enter the number of employee to be updated");
		int num=scan.nextInt();
		em.update(num, details());
		em.print();
		System.out.println("Enter the number of employee to be deleted");
		int del=scan.nextInt();
		
		em.delete(del);
		em.print();
		
		
	}
	public static Emp details()
	{
		Emp e2=new Emp();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter EMployee Details:");
		e2.setEmpno(scan.nextInt());
		scan.nextLine();
		e2.setEname(scan.nextLine());
		e2.setSalary(scan.nextDouble());
		return e2;
	}

}
