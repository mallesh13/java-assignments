package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.filehandling.model.WordCountApplication;

public class WordCountApplicationTest {

	@Test
	public void testCountingWords() throws IOException {
		WordCountApplication wordCount = new WordCountApplication();
		assertEquals(33, wordCount.checkWordCount());
	}

	@Test
	public void testInvalidCountingWords() throws IOException {
		WordCountApplication wordCount = new WordCountApplication();
		assertNotEquals(30, wordCount.checkWordCount());
	}

}
