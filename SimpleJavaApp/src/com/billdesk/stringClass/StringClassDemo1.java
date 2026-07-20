package com.billdesk.stringClass;

public class StringClassDemo1 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World"; 
		
		System.out.println(str1.startsWith("H")); 
		
		System.out.println(str1.concat(str2));
		System.out.println(str1);
		System.out.println(str2);
		
		StringBuffer sbuff1 = new StringBuffer("never");
		//sbuff1.append(" give up"); 
		
		//sbuff1.replace(5,5, "give up"); 
		
		//sbuff1.insert(5,  " give up"); 
		
		//sbuff1.delete(2, 3); 
		
		//Stringbuffer is threadsafe and stringbuilder is not
		
		
		System.out.println(sbuff1);
		
		
	}
}
