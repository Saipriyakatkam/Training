package com.personinterface;

import com.personexception.PersonNotfoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Person;

public class PersonInterfaceImpl implements PersonInterface {

	
	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		Person p;
		int id;
		String name;
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter Person Details");
			System.out.println("Enter Person Id ");
			id=scan.nextInt();
			
			System.out.println("Enter Person Name");
			name=scan.next();
			persons.add(new Person(id,name));
		}
		
		return persons;
	}

	@Override
	public Person findById(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		
		for(Person p:persons)
		{
			if(p.getId()==id)
			{
				return p;
			}
		}
		PersonNotfoundException.checkException("Person not found by id");
		return null;
	}

	@Override
	public boolean removePerson(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		for(Person p:persons)
		{
			if(p.getId()==id)
			{
				persons.remove(p);
				return true;
			}
		}
		PersonNotfoundException.checkException("Person with id doesnot exsits");

		return false;
	}

	

	@Override
	public List<Person> addPerson(List<Person> persons, Person person) {
		// TODO Auto-generated method stub
		persons.add(person);
		return persons;
	}

	@Override
	public Person updatePerson(int id, List<Person> persons, String name) {
		// TODO Auto-generated method stub
		Person p;
		p=findById(id, persons);
		if(p!=null)
		{
			p.setName(name);
			return p;
		}
		PersonNotfoundException.checkException("Person with id not found");

		return null;
	}
	
}
