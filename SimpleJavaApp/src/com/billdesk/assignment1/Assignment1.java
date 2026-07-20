package com.billdesk.assignment1;

import java.util.Scanner;

/*class weather{
	private String cityName; 
	
	public void setCityName(String cityName) {
		this.cityName = cityName; 
	}
	public String getCityName() {
		return "City name is:" + cityName; 
	}
}
*/
public class Assignment1 { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String cityName = scanner.nextLine();
		System.out.println("City: " + cityName);
		int[] temp = new int[7]; 
		int sum = 0; 
		int hot = 0; 
		int pleasant = 0; 
		int cold = 0; 
		for(int i = 0; i < 7; i++) {
			temp[i] = scanner.nextInt();
			sum += temp[i]; 
			if(temp[i] > 35) {
				hot+=1; 
			}else if(temp[i] <=  35 && temp[i] >= 20) pleasant += 1; 
			else cold++; 
		}
		float avg = sum/7; 
		
		System.out.println("Average: " + avg);
		System.out.println("Hot: " + hot);
		System.out.println("Pleasant: " + pleasant);
		System.out.println("Cold: "+ cold);
	}
}
