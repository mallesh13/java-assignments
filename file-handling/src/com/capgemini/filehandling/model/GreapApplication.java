package com.capgemini.filehandling.model;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class GreapApplication {

	public List<String> checkWordPresent(String word) throws IOException {
		FileReader reader = new FileReader("C:\\Mallesh\\testfile.txt");
		LineNumberReader lineNumberReader = new LineNumberReader(reader);
		String line;
		List<String> list=new ArrayList<String>();
		while ((line = lineNumberReader.readLine()) != null) {
			for (String element : line.split(" ")) {
				if (element.equalsIgnoreCase(word)) {
					list.add("Word found at line " + lineNumberReader.getLineNumber());
				}
			}
		}
		return list ;
	}

}
