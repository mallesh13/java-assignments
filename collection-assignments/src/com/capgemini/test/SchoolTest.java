package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.School;

public class SchoolTest {

	private School zphsSchool;
	private School sssmSchool;
	private School lordsSchool;
	@Before
	public void setUp() {
		zphsSchool = new School("ZPHS","Badangpet","RangaReddy",33);
		sssmSchool =new School("SSSM","I.S.Sadan","Hyderabad",20);
		lordsSchool= new School("Lords","B.N.Reddy","RangaReddy",32);
	}
	@Test
	public void testSchoolIsAcceptingDuplicates() {
		ArrayList<School> schools=new ArrayList<>();
		schools.add(zphsSchool);
		schools.add(sssmSchool);
		schools.add(lordsSchool);
		schools.add(sssmSchool);
		
		Iterator<School> it=schools.iterator();
		
		assertEquals(zphsSchool, it.next());
		assertEquals(sssmSchool, it.next());
		assertEquals(lordsSchool, it.next());
		assertEquals(sssmSchool, it.next());
		
	}
	@Test
	public void testSchoolIsNotAcceptingDuplicates() {
		Set<School> schools=new HashSet<School>();
		schools.add(zphsSchool);
		schools.add(lordsSchool);
		schools.add(sssmSchool);
		schools.add(lordsSchool);
		assertEquals(3, schools.size());
	}
}
