package com.capgemini.filehandling.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication {
	public int checkWordCount() throws IOException {
		FileReader reader = new FileReader("C:\\Mallesh\\testfile.txt");
		BufferedReader breader = new BufferedReader(reader);
		int count = 0;
		String content;

		while ((content = breader.readLine()) != null) {
			String s[] = content.split(" ");
			count += s.length;

		}

		System.out.println("Words Counted successfully");
		breader.close();
		reader.close();
		return count;
	}
}
