package com.billdesk.collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>(); 
		
		stringList.add("Sample string 1"); 
		stringList.add("Sample string 2"); 
		stringList.add("Sample string 3"); 
		
		stringList.size(); 
		
		stringList.remove(1); 
		stringList.remove("Sample String 3"); 
		
		stringList.reversed(); 
	}
}
