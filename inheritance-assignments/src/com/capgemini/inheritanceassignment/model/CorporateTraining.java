package com.capgemini.inheritanceassignment.model;

public class CorporateTraining extends Training {

	private int days;

	public CorporateTraining() {
		super();

	}

	public CorporateTraining(int id, String subjects, double fees,int days) {
		super(id, subjects, fees);
		this.days=days;
	}
	
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public double getOrderValue() {

		return getFees()*getDays();
	}

}
