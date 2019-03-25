package com.capgemini.client;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList< String> names= new ArrayList<String>();
		System.out.println(names.isEmpty());
		names.add("Alex");
		names.add("bob");
		names.add("adam");
		names.add("dawan");
		Iterator< String> it=names.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(name);
		}
		System.out.println(names.get(2));
		System.out.println(names.indexOf("bob"));
		names.add("anna");
		System.out.println(names.set(4, "Anna"));
		System.out.println(names.remove(4));
		System.out.println(names);
	}
}
