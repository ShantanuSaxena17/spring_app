package com.billdesk.day2;

class Cars{
	private int makeYear; 
	private String brand; 
	private String model; 
	private String color; 
	
	Cars(){
		this.color = "White";
		this.makeYear = 2025; 
	}
	Cars(String brand, String model){
		this();
		this. brand = brand; 
		this.model = model; 
	}
	Cars(int makeYear, String brand, String model, String color){
		this.makeYear = makeYear; 
		this. brand = brand; 
		this.model = model; 
		this.color = color; 
	}
	public String displayCarDetails() {
		return "Car Details: \n" +
				"makeYear: " + makeYear + "\n" +
				"brand: " + brand + "\n" +
				"model: " + model + "\n" +
				"color: " + color + "\n";
	}
}
public class Car {
	public static void main(String[] args) {
		Cars car1 = new Cars("BMW", "M4");
		System.out.println(car1.displayCarDetails());
	}
}
