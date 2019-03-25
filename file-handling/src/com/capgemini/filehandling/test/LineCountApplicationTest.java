package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.filehandling.model.LineCountApplication;

public class LineCountApplicationTest {
	
	@Test
	public void testCountingLines() throws IOException {
		LineCountApplication lineCount = new LineCountApplication();
		assertEquals(9, lineCount.checkLineCount());
	}
	@Test
	public void testFalseCountingLines() throws IOException {
		LineCountApplication lineCount = new LineCountApplication();
		assertNotEquals(10, lineCount.checkLineCount());
	}
}
