import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.personinterface.PersonInterfaceImpl;
import com.pojo.Person;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonInterfaceImpl pi=new PersonInterfaceImpl();
		List<Person> persons=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		persons=pi.getPersons();
		Person p=new Person();
		int choice,pid;
		String name;
		boolean isRemoved;
		do
		{
		System.out.println("===============MENU=============");
		System.out.println("1.FIND PERSON BY ID");
		System.out.println("2.ADD NEW PERSON");
		System.out.println("3.REMOVE PERSON BY ID");
		System.out.println("4.UPDATE PERSON NAME");
		System.out.println("5.DISPLAY ALL PERSONS");
		System.out.println("6.STOP");
		
		System.out.println("Enter Choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Book Id to be finded");
			pid=sc.nextInt();
			
			p=pi.findById(pid, persons);
			if(p!=null)
			{
				System.out.println(p);
			}
			break;
		case 2:
			System.out.println("Enter New Persion Details");
			System.out.println("enter ID:");
			pid=sc.nextInt();
			
			System.out.println("enter Name");
			name=sc.next();
			
			persons=pi.addPerson(persons, new Person(pid,name));
			System.out.println("Person Added");
			break;
		case 3:
			System.out.println("enter the person to be removed");
			pid=sc.nextInt();

			isRemoved=pi.removePerson(pid, persons);
			if(isRemoved==true)
			{
				System.out.println("Person Removed");
			}
			break;
		case 4:
			System.out.println("Enter the person id and Name to be updated");
			System.out.println("enter ID:");
			pid=sc.nextInt();
			
			System.out.println("enter Name");
			name=sc.next();
			
			p=pi.updatePerson(pid, persons, name);
			if(p!=null)
			{
				System.out.println(p);
			}
			break;
		case 5:
			System.out.println("DISPLAYING PERSONS INFORMATION");
			pi.displayPersons(persons);
			break;
			
		case 6:System.out.println("Thankyou");
		choice=6;
		break;
		
	}
	}while(choice!=6);
	
	}

}
