package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.capgemini.filehandling.model.GreapApplication;

public class GreapApplicationTest {

	@Test
	public void testCheckWordPresent() throws IOException {
		GreapApplication greap = new GreapApplication();
		List<String> expectedList=new ArrayList<String>();
		expectedList.add("Word found at line 3");
		expectedList.add("Word found at line 6");
		expectedList.add("Word found at line 9");
		
		assertEquals(expectedList,greap.checkWordPresent("exist"));
		
	
	}

}
