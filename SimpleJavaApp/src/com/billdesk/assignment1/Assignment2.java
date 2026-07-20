package com.billdesk.assignment1;

import java.util.Scanner;

class book{
	public String title; 
	public String author;
	public int price; 
	
	book(String title, String author, int price){
		this.title = title; 
		this.author = author; 
		this.price = price; 
	}
}

public class Assignment2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter number of books: ");
		int n = scanner.nextInt(); 
		book[] arr = new book[n]; 
		
		for(int i = 0; i < n; i++) {
			System.out.println("Title" + (i+1) + ":");
			String title = scanner.next(); 
			System.out.println("Author" + (i+1) +":");
			String author = scanner.next();
			System.out.println("price" + (i+1) +":");
			int price = scanner.nextInt();
			arr[i] = new book(title, author, price); 
		}
		int cnt = 0; 
		for(book a : arr) {
			if(a.price > 200) {
				System.out.println(a.author);
				cnt++; 
			}
		}
		if(cnt == 0) {
			System.out.println("No book found with price greater than 200");
		}
		
	}
}
