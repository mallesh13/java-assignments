package com.capgemini.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private int rollNumber;
	private String name;
	private String branch;
	public Student() {
		super();
		
	}
	
	public Student(int rollNumber, String name, String branch) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNumber,name);
	}
	
	@Override
	public boolean equals(Object object) {
		if(object==null)
			return false;
		if(!(object instanceof Student))
			return false;
		if(this==object)
			return true;
		Student student=(Student) object;
		if(this.name.equals(student.name) && this.rollNumber==student.rollNumber)
			return true;
		else
			return false;
		
	}

	@Override
	public int compareTo(Student students) {
		
		return (this.name.compareTo(students.name));
	}

	

}
