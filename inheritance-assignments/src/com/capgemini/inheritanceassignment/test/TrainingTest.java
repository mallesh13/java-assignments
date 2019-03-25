package com.capgemini.inheritanceassignment.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.inheritanceassignment.model.CorporateTraining;
import com.capgemini.inheritanceassignment.model.PublicTraining;
import com.capgemini.inheritanceassignment.model.Training;

public class TrainingTest {

	@Test
	public void testPublicTrainingOrderValue() {
		Training details=new PublicTraining(101, "Java", 5000, 50);
		assertEquals(250000, details.getOrderValue());
	}
	@Test
	public void testCorporateTrainingOrderValue() {
		Training details=new CorporateTraining(1001, "Big Data", 35000, 4);
		assertEquals(140000, details.getOrderValue());
	}
	

	@Test
	public void testPublicTrainingFalseOrderValue() {
		Training details=new PublicTraining(101, "Java", 5000, 50);
		assertNotEquals(25000, details.getOrderValue());
	}
	@Test
	public void testCorporateTrainingFalseOrderValue() {
		Training details=new CorporateTraining(1001, "Big Data", 35000, 4);
		assertNotEquals(14000, details.getOrderValue());
	}
}
