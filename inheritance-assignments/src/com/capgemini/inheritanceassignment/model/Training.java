package com.capgemini.inheritanceassignment.model;

public abstract class Training {

	private int id;
	private String subjects;
	private double fees;

	public Training() {
		super();
		
	}

	public Training(int id, String subjects, double fees) {
		super();
		this.id = id;
		this.subjects = subjects;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	public abstract double getOrderValue();

	@Override
	public String toString() {
		return "Training [id=" + id + ", subjects=" + subjects + ", fees=" + fees + "]";
	}

}
