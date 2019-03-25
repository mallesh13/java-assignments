package com.capgemini.filehandling.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * File file = new File("C:/Mallesh/javapath.txt");
		 * System.out.println(file.exists()); File file1 = new
		 * File("C:/Mallesh/javapath.txt1"); File folder = new File("C:/Mallesh");
		 * System.out.println(file1.exists()); System.out.println(file.isFile());
		 * System.out.println(folder.exists());
		 */

		/*
		 * File newFile=new File("text.txt"); if(!newFile.exists()) {
		 * file.createNewFile(); System.out.println("file is created successfully"); }
		 * //FileWriter writer=new FileWriter(newFile); //BufferedWriter writer=new
		 * BufferedWriter(new FileWriter(newFile)); //PrintWriter writer=new
		 * PrintWriter(newFile); PrintWriter writer=new PrintWriter(new
		 * FileWriter(newFile, true)); writer.println("hello....");
		 * writer.println("welcome...."); writer.println("to....");
		 * writer.println("file handling...."); writer.close();
		 * System.out.println("added Successfully.......!!!");
		 */
		
		/*
		 * BufferedReader br=new BufferedReader(new FileReader("text.txt")); PrintWriter
		 * pw=new PrintWriter("textCopy.txt"); String result;
		 * while((result=br.readLine())!=null) { pw.println(result); } pw.close();
		 * br.close();
		 */
		
		
		/*
		 * File filedirectory= new File("c:\\Program Files");
		 * System.out.println(filedirectory.isDirectory()); String
		 * files[]=filedirectory.list(); for(String s: files) { System.out.println(s); }
		 */
		
		File createDirectory=new File("myNewDir");
		if(!createDirectory.exists()) {
			createDirectory.mkdir();
		System.out.println("created");
		}
		File subfile=new File(createDirectory,"subfile.txt");
		if(!subfile.exists()) {
			subfile.createNewFile();
		System.out.println("file created");
		}
		
		
		
		
	} 

}
