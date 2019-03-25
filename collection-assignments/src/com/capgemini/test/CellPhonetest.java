package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.CellPhone;

public class CellPhonetest {

	private CellPhone sonyMobile;
	private CellPhone onePlusMobile;
	private CellPhone samsungMobile;
	@Before
	public void setUp() {
		sonyMobile=new CellPhone("Sony","Xperia XA1 Plus","available from 2018","Andriod Pie",25000);
		onePlusMobile=new CellPhone("OnePlus","7T","available from 2020","Andriod Pie9.0.1",39000);
		samsungMobile=new CellPhone("SamSung","Note7","available from 2015","Andriod 8.0.2",50000);
		
	}
	@Test
	public void testCellPhoneAcceptingDuplicateValues() {
		ArrayList<CellPhone> cellphones=new ArrayList<>();
		cellphones.add(samsungMobile);
		cellphones.add(sonyMobile);
		cellphones.add(onePlusMobile);
		cellphones.add(sonyMobile);
		
		Iterator<CellPhone> it=cellphones.iterator();
			
		assertEquals(samsungMobile, it.next());
		assertEquals(sonyMobile, it.next());
		assertEquals(onePlusMobile, it.next());
		assertEquals(sonyMobile, it.next());
	
	}
	@Test
	public void testCellPhoneNotAcceptingDuplicateValues() {
		Set<CellPhone> cellPhones =new HashSet<>();
		cellPhones.add(sonyMobile);
		cellPhones.add(onePlusMobile);
		cellPhones.add(samsungMobile);
		cellPhones.add(samsungMobile);
		assertEquals(3, cellPhones.size());
	}
}
