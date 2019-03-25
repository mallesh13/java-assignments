package com.capgemini.test;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Car;

public class CarTest {

	private Car bmwCar;
	private Car audiCar;
	private Car hondaCar;
	@Before
	public void setUp(){
		bmwCar = new Car("BMW","INext",2001,3000000);
		audiCar = new Car("Audi","A4",2003,2500000);
		hondaCar = new Car("Honda","Civic",2010,1000000);
	}
	@Test
	public void testCarAcceptingDuplicateValues() {
		ArrayList<Car> cars= new ArrayList<>();
		cars.add(bmwCar);
		cars.add(audiCar);
		cars.add(hondaCar);
		cars.add(bmwCar);
		
		Iterator<Car> it=cars.iterator();
			
		assertEquals(bmwCar,it.next());
		assertEquals(audiCar, it.next());
		assertEquals(hondaCar, it.next());
		assertEquals(bmwCar,it.next());
	}
	
	@Test
	public void testCarNotAcceptingDuplicateValues() {
		HashSet<Car> cars= new HashSet<>();
		cars.add(bmwCar);
		cars.add(audiCar);
		cars.add(hondaCar);
		
		assertEquals(3, cars.size());

	}
	
	@Test
	public void testCarSortedBasedOnMake() {
		TreeSet<Car> cars= new TreeSet<>();
		cars.add(bmwCar);
		cars.add(audiCar);
		cars.add(hondaCar);
		Iterator<Car> it=cars.iterator();
		assertEquals(audiCar, it.next());
		assertEquals(bmwCar, it.next());
		assertEquals(hondaCar, it.next());	
		
	}
	
}
