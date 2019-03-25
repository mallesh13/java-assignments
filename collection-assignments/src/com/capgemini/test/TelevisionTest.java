package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Television;

public class TelevisionTest {
	private Television samsungTelevision;
	private Television lgTelevision;
	private Television miTelevision;
	@Before
	public void setUp(){
		samsungTelevision = new Television("Samsung","LED","Yes",75000);
		lgTelevision = new Television("LG","Plasma","Yes",100000);
		miTelevision = new Television("MI","LCD","No",30000);
	}
	@Test
	public void testTelevisionAcceptingDuplicates() {
		ArrayList<Television> televisions=new ArrayList<>();
		televisions.add(samsungTelevision);
		televisions.add(lgTelevision);
		televisions.add(miTelevision);
		televisions.add(samsungTelevision);
		
		Iterator<Television> it=televisions.iterator();
		
		assertEquals(samsungTelevision, it.next());
		assertEquals(lgTelevision, it.next());
		assertEquals(miTelevision, it.next());
		assertEquals(samsungTelevision, it.next());
		
	}
	@Test
	public void testTelevisionNotAcceptingDuplicates() {
		HashSet<Television> televisions=new HashSet<>();
		televisions.add(samsungTelevision);
		televisions.add(lgTelevision);
		televisions.add(miTelevision);
		televisions.add(samsungTelevision);
		assertEquals(3, televisions.size());
		
	}
}
