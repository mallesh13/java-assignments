package com.capgemini.exceptionhandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.exceptionhandling.exceptions.AgeNotWithinRangeException;
import com.capgemini.exceptionhandling.exceptions.NameNotValidException;
import com.capgemini.exceptionhandling.model.Student;

public class StudentTest {
	
	
	@Test
	public void testAgeOfStudentWithInRange() throws AgeNotWithinRangeException {
		Student student=new Student(11011,"joe",17,"java");
		student.checkAgeWithInRange();
		assertEquals(17, student.checkAgeWithInRange());
	}
	@Test(expected=AgeNotWithinRangeException.class)
	public void testAgeOfStudentNotWithInRange() throws AgeNotWithinRangeException {
		Student student=new Student(11011,"joe",10,"java");
		student.checkAgeWithInRange();
	}
	@Test
	public void testValidNameOfStudent() throws NameNotValidException  {
		Student student=new Student(11011,"joe",17,"java");
		student.checkStudentName();
		assertEquals("joe", student.checkStudentName());
	}
	@Test(expected=NameNotValidException.class)
	public void testInValidNameOfStudent() throws NameNotValidException  {
		Student student=new Student(11011,"j425e",17,"java");
		student.checkStudentName();
		
	}
}
