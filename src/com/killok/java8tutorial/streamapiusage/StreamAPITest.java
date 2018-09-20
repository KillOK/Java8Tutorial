package com.killok.java8tutorial.streamapiusage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamAPITest {

	private static List<Person> persons;

	public static void main(String[] args) {
		
		persons = new ArrayList<>();
		
		persons.addAll(Arrays.asList(new Person[]{new Person(16, "Ali"),new Person(31, "Inna"),new Person(21, "Stepan"),new Person(2, "Kate"),new Person(10, "Igor"),new Person(41, "Anna"), new Person(24, "Joe"), new Person(26, "Oguz")}));
		
		
		/*for (Person person : persons) {
			System.out.println(person);
		}*/
		
//		persons.stream().forEach((Person p)->System.out.println(p));

//		persons.stream().forEach( p->System.out.println(p));		// The only param don't need type
		
//		persons.stream().forEach(System.out::println);		// As static..
		
		/**
		 * Just image how much code would you write 
		 * for filtering,
		 * sorting 
		 * and output of this array,
		 * with collection api and iteration usage...
		 * 
		 * Very helpful for work with RDBS
		 */

		persons.stream().
		filter(p -> p.getAge()>=18).							// return only persons with age >=18
		sorted((p1,p2)->p1.getName().compareTo(p2.getName())).	// sort by name with comparator written with lambda usage
//		map(p -> p.getName()).									// convert to list of persons names
		forEach(System.out::println);							// write output into console
		
		double avAge = persons.stream().
		filter(p -> p.getAge()>=18).
		mapToInt(p -> p.getAge()).average().getAsDouble();
		System.out.println(avAge);
	}

}






















