package com.capgemini.model;

import java.util.Objects;

public class School {

	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRating;
	public School() {
		super();
	
	}
	public School(String name, String city, String schoolDistrict, int greatSchoolRating) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRating = greatSchoolRating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchoolDistrict() {
		return schoolDistrict;
	}
	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}
	public int getGreatSchoolRating() {
		return greatSchoolRating;
	}
	public void setGreatSchoolRating(int greatSchoolRating) {
		this.greatSchoolRating = greatSchoolRating;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict + ", greatSchoolRating="
				+ greatSchoolRating + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name,city,schoolDistrict);
	}
	@Override
	public boolean equals(Object school) {
		if(school==null)
			return false;
		if(!(school instanceof School))
			return false;
		if(this==school)
			return true;
		School obj= (School) school;
		if(this.name.equals(obj.name) && this.city.equals(obj.city)
				&& this.greatSchoolRating== obj.greatSchoolRating)
			return true;
		else
			return false;
		
	}
}
