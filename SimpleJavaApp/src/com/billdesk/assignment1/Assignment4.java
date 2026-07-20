package com.billdesk.assignment1;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		System.out.println("Enter size of Array: ");
		Scanner scanner = new Scanner(System.in); 
		int n = scanner.nextInt(); 
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt(); 
		}
		Boolean flag = true; 
		for(int i = 0; i < n-1; i++) {
			if(Math.abs(arr[i]-arr[i+1]) != 1) {
				System.out.println("Not all consecutive differences are 1");
				flag = false; 
				break; 
			}
		}
		if(flag)System.out.println("All consecutive differences are 1");
	}
}
