package com.capgemini.filehandling.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.filehandling.model.BankAccount;
import com.capgemini.filehandling.model.DebitCard;

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		DebitCard debitCard=new DebitCard(1234567800001212L, 654, 11, 2024);
		BankAccount account =new BankAccount(1001, "Adam", "Savings", 25000, debitCard);
		
		// Serialization Process
		FileOutputStream fileOutputStream=new FileOutputStream("account.ser");
		ObjectOutputStream  objectOutputStream=new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(account);
		objectOutputStream.close();
		
		
		FileInputStream fileInputStream=new FileInputStream("account.ser");
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		
		BankAccount account2= (BankAccount)inputStream.readObject();
		inputStream.close();
		System.out.println( account2);
		
	}
}
