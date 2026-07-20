package com.billdesk.assignment1;

import java.util.Scanner;

//Email analyzer

public class Assignment3 {
	public static void main(String[] args) {
		System.out.println("Enter your email:");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.nextLine(); 
		
		int cnt = 0; 
		for(int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == '@') cnt++; 
		}
		if(cnt != 1 || email.startsWith("@") || email.endsWith("@")) {
			System.out.println("Invalid email format");
		}else {
			int a = email.indexOf("@");
			System.out.println("Username: " + email.substring(0, a));
			System.out.println("Domain: " + email.subSequence(a+1, email.length()));
			if(email.endsWith("gmail.com")) {
				System.out.println("Gmail detected!");
			}else {
				System.out.println("No gmail address detected");
			}
		}
	}
}
