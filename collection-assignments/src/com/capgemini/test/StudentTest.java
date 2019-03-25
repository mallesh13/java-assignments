package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Student;

public class StudentTest {

	private Student alexDetails;
	private Student bobdetails;
	private Student adamDetails;
	@Before
	public void setUp() {
		alexDetails=new Student(1012,"Alex","CSE");
		bobdetails =new Student(1022,"Bob","ECE");
		adamDetails = new Student(20123,"Adam","EEE");
		
	}
	@Test
	public void testStudentDetailsAddedAsGivenFormat() {
		ArrayList<Student> students =new ArrayList<Student>();
		students.add(alexDetails);
		students.add(bobdetails);
		students.add(adamDetails);
		students.add(alexDetails);
		
		Iterator<Student> it=students.iterator();
		
		assertEquals(alexDetails, it.next());
		assertEquals(bobdetails, it.next());
		assertEquals(adamDetails, it.next());
		assertEquals(alexDetails, it.next());
	}
	@Test
	public void testStudentDetailsStoredInNaturalOrder() {
		TreeSet<Student> students=new TreeSet<Student>();
		students.add(bobdetails);
		students.add(alexDetails);
		students.add(adamDetails);
		
		Iterator<Student> it=students.iterator();
		
		assertEquals(adamDetails, it.next());
		assertEquals(alexDetails, it.next());
		assertEquals(bobdetails, it.next());
		
		}
	@Test
	public void testDisplayStudentFavoriteFruitByGivingStudentName() {
		Map<String ,String> favoriteFruit=new HashMap<String, String>();
		favoriteFruit.put("Alex","Mango");
		favoriteFruit.put("Bob", "Orange");
		favoriteFruit.put("Adam","Apple");
	
		Collection<String > keys=favoriteFruit.keySet();
		assertEquals(3, keys.size());
		
		Collection<String> values=favoriteFruit.values();
		assertEquals(3, values.size());
		
		assertEquals("Mango",favoriteFruit.get("Alex"));
		assertEquals("Orange", favoriteFruit.get("Bob"));
		assertEquals("Apple", favoriteFruit.get("Adam"));
		
 		
		
	}
}
