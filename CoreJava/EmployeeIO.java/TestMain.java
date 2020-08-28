import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.io.EmpIOImpl;
import com.io.EmployeeOperationsImpl;
import com.pojo.Employee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<Employee>();
		EmployeeOperationsImpl eo=new EmployeeOperationsImpl();
		EmpIOImpl e=new EmpIOImpl();
		Employee emp=new Employee();
		int choice,id;
		String name;
		Scanner s=new Scanner(System.in);
		Boolean isAdded;
		
		
		do
		{
			System.out.println("==========MENU===========");
			System.out.println("1.ADD EMPLOYEE");
			System.out.println("2.UPDATE EMPLOYEE NAME USING ID");
			System.out.println("3.DELETE EMPLOYEE BY ID");
			System.out.println("4.FIND EMPLOYEE BY ID");
			System.out.println("5.FIND ALL EMPLOYEES");
			System.out.println("6.STOP");
			System.out.println("Enter Choice");
			choice=s.nextInt();
			
			switch(choice)
			{
			case 1:
				emp=e.readFromUser();
				isAdded=eo.addEmployee(emp);
				if(isAdded==true)
					System.out.println("Employee Added");
				else
					System.out.println("employee Not Added");
				break;
			case 2:
				System.out.println("Enter Employee Details to Updated ");
				System.out.println("Enter Employee id");
				id=s.nextInt();
				System.out.println("Enter Employee Name");
				name=s.next();
				emp=eo.updateEmployee(id, name);
				if(emp!=null)
				{
					System.out.println("employee updated");
					e.displayToUser(emp);
				}
				else
					System.out.println("Employee with provided id is not found");
				break;
			case 3:
				System.out.println("Enter Employee Details to Deleted ");
				System.out.println("Enter Employee id");
				id=s.nextInt();
				emp=eo.deleteEmployee(id);
				if(emp!=null)
				{
					System.out.println("employee deleted");
					e.displayToUser(emp);
				}
				else
					System.out.println("Employee with provided id is not found");
				break;
			case 4:
				System.out.println("Enter Employee Details to finded ");
				System.out.println("Enter Employee id");
				id=s.nextInt();
				emp=eo.findEmployeeById(id);
				if(emp!=null)
				{
					System.out.println("employee found");
					e.displayToUser(emp);
				}
				else
					System.out.println("Employee with provided id is not found");
				break;
			case 5:
				System.out.println("DISPLAYING INFORMATION");
				eo.findAllEmployees();
				break;
			case 6:
				System.out.println("THANK YOU\nPROGRAM STOPPED");
				choice=6;
				break;
			}
			
		}while(choice<=6);

	}

}
