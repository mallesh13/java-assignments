package com.capgemini.inheritanceassignment.model;

public class PublicTraining extends Training{

	private int participents;

	public PublicTraining() {
		super();
			}

	public PublicTraining(int id, String subjects, double fees,int participents) {
		super(id, subjects, fees);
		this.participents=participents;
	}
	
	public int getParticipents() {
		return participents;
	}

	public void setParticipents(int participents) {
		this.participents = participents;
	}

	@Override
	public double getOrderValue() {
		
		return getFees()*getParticipents();
	}
	
}
