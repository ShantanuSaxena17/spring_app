package com.billdesk.day2;

class Employee{
	private int empID;
	private String name; 
	public String Location; 
	
	Employee(){
		this.Location = "Mumbai"; 
	}
	Employee(int empID, String name){
		this(); 
		this.empID = empID; 
		this.name = name; 
	}
	Employee(int empID, String name, String Location){
		
		this.empID = empID; 
		this.name = name; 
		this.Location = Location; 
	}
	
	public String displayDetail() {
		return "Employee Details: \n" +
				"empID: " + empID + "\n" +
				"Name: " + name + "\n" +
				"Location: " + Location + "\n" ;
	}
	
}

public class Demo1 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Shantanu", "Jaipur"); 
		Employee emp2 = new Employee(2, "Maulik"); 
		Employee emp3 = new Employee(3, "Lipi"); 
		System.out.println(emp1.displayDetail()); 
		System.out.println(emp2.displayDetail()); 
		System.out.println(emp3.displayDetail()); 
	}
}
