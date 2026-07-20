package com.billdesk.assignment1;

import java.util.Scanner;

interface bonusCalculator{
	double calculateBonus(); 
}

class Employee{
	int employeeID; 
	String employeeName; 
	double basicSalary; 
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	Employee(int employeeID, String employeeName, double basicSalary){
		this.employeeID = employeeID; 
		this.employeeName = employeeName; 
		this.basicSalary = basicSalary; 
	}
}
class Manager extends Employee implements bonusCalculator{
	
	Manager(int id, String name, double salary) {
        super(id, name, salary);
    }
	@Override
	public double calculateBonus() {
		// TODO Auto-generated method stub
		return basicSalary*0.2;
	}
}
class Developer extends Employee implements bonusCalculator{
	
	Developer(int id, String name, double salary) {
        super(id, name, salary);
    }
	
	@Override
	public double calculateBonus() {
		// TODO Auto-generated method stub
		return basicSalary*0.1;
	}
}
public class Assignment6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter number of employees: ");
		int n = scanner.nextInt(); 
		Employee[] employees = new Employee[n]; 
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter employee type (Manager/Developer):");
			String type = scanner.next();

			System.out.println("Enter employee ID:");
			int id = scanner.nextInt();

			System.out.println("Enter employee name:");
			String name = scanner.next();

			System.out.println("Enter basic salary:");
			double salary = scanner.nextDouble();
			
			if(type.equalsIgnoreCase("Manager")) {
			    employees[i] = new Manager(id, name, salary);
			}
			else if(type.equalsIgnoreCase("Developer")) {
			    employees[i] = new Developer(id, name, salary);
			}
			else {
			    System.out.println("Invalid employee type.");
			    i--;        // repeat this iteration
			}
		}
		boolean found = false;

		for(Employee emp : employees) {
			double bonus = ((bonusCalculator) emp).calculateBonus();
			if(bonus > 10000) {

			    found = true;

			    System.out.println("Employee ID : " + emp.getEmployeeID());
			    System.out.println("Employee Name : " + emp.getEmployeeName());

			    if(emp instanceof Manager)
			        System.out.println("Employee Type : Manager");
			    else
			        System.out.println("Employee Type : Developer");

			    System.out.println("Basic Salary : " + emp.getBasicSalary());
			    System.out.println("Bonus : " + bonus);
			    System.out.println();
			}
		}
		if(!found) {
		    System.out.println("No employee has a bonus greater than ₹10,000.");
		}
		
	}
}
