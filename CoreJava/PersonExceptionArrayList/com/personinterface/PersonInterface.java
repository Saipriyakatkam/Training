package com.personinterface;

import java.util.Iterator;
import java.util.List;

import com.pojo.*;
public interface PersonInterface {

	abstract public List<Person> getPersons();
	abstract public Person findById(int id, List<Person>persons);
	abstract public boolean removePerson(int id,List<Person>persons);
	abstract public Person updatePerson(int id, List<Person> persons, String name);
	abstract public List<Person> addPerson(List<Person> persons, Person person); 
	public default void displayPersons(List<Person> persons)
	{
		Iterator<Person> iterator=persons.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
	
}
