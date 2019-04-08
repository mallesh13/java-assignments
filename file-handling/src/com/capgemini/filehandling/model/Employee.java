package com.capgemini.filehandling.model;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable{
	private int id;
	private String name;
	private double salary;
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		if(obj==this)
			return true;
		Employee employee=(Employee) obj;
		if(this.id==employee.id)
			return true;
		else 
			return false;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
