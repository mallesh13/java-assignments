package com.capgemini.test;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Laptop;

public class LaptopTest {
	private Laptop dellLaptop;
	private Laptop hpLaptop;
	private Laptop acerLaptop;
	@Before
	public void setUp(){
		dellLaptop = new Laptop("Dell","Inspiron","Windows 8","i3");
		hpLaptop = new Laptop("HP","Pevilion","Windows 10","i10");
		acerLaptop = new Laptop("acer","intel","Windows 7","i5");
	}
	@Test
	public void testLaptopAcceptingDuplicateValues() {
		ArrayList<Laptop> laptops= new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerLaptop);
		laptops.add(dellLaptop);
		
		Iterator<Laptop> it=laptops.iterator();
			
		assertEquals(dellLaptop,it.next());
		assertEquals(hpLaptop, it.next());
		assertEquals(acerLaptop, it.next());
		assertEquals(dellLaptop,it.next());
	}
	
	@Test
	public void testLaptopNotAcceptingDuplicateValues() {
		HashSet<Laptop> laptops= new HashSet<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerLaptop);
		laptops.add(dellLaptop);
		assertEquals(3, laptops.size());
		
	}

	
}
