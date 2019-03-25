package com.capgemini.exceptionhandling.model;

import com.capgemini.exceptionhandling.exceptions.AgeNotWithinRangeException;
import com.capgemini.exceptionhandling.exceptions.NameNotValidException;

public class Student {

	private long rollNumber;
	private String studentName;
	private int studentAge;
	private String course;
	public Student() {
		super();
	}
	public Student(long rollNumber, String studentName, int studentAge, String course) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.course = course;
	}
	public long getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public int checkAgeWithInRange() throws AgeNotWithinRangeException {
		if(getStudentAge()>=15 && getStudentAge()<=21) {
			return getStudentAge();
		}
		else
			throw new AgeNotWithinRangeException("age not between 15 and 21");
	}
	
	public String checkStudentName() throws NameNotValidException {
		
		if(getStudentName().matches("[a-zA-z]*")) {
			return getStudentName();
		}
		else
			throw new NameNotValidException("Name Should not contains special symbols and numbers");

		
	}
	
}
