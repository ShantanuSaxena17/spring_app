package com.billdesk.assignment1;


import java.util.ArrayList;
import java.util.Scanner;

class Vehicle{
	String registrationNumber; 
	String ownerName; 
	String manufacturer; 
	int price;
	
	public Vehicle(String registrationNumber, String ownerName, String manufacturer, int price) {
		// TODO Auto-generated constructor stub
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName; 
		this.manufacturer = manufacturer; 
		this.price = price; 
	}
	
}
class Car extends Vehicle{
	String fuelType; 
	
	public Car(String registrationNumber, String ownerName, String manufacturer, int price, String fuelType) {
		// TODO Auto-generated constructor stub
		super(registrationNumber, ownerName, manufacturer, price); 
		this.fuelType = fuelType; 
		
	}

	@Override
	public String toString() {
		return "Car [fuelType=" + fuelType + ", registrationNumber=" + registrationNumber + ", ownerName=" + ownerName
				+ ", manufacturer=" + manufacturer + ", price=" + price + "]";
	}
	
}
public class Assignment9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int choice; 
		ArrayList<Car> arr = new ArrayList<>(); 
		do {
			System.out.println("========== Vehicle Registration System ==========");
			System.out.println("1. Register Vehicle");
			System.out.println("2. View All Vehicles");
			System.out.println("3. Update Vehicle");
			System.out.println("4. Delete Vehicle");
			System.out.println("5. Search Vehicle");
			System.out.println("6. Display Premium Vehicles");
			System.out.println("7. Exit");
			System.out.println("=================================================");
			
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			if(choice == 1) {
				System.out.println("enter registration number:");
				String registrationNumber = scanner.next(); 
				System.out.println("enter owner name:");
				String ownerName = scanner.next(); 
				System.out.println("enter manufacturer:");
				String manufacturer = scanner.next(); 
				System.out.println("enter price:");
				int price = scanner.nextInt();
				System.out.println("enter fueltype:");
				String fuelType = scanner.next(); 
				Car obj = new Car(registrationNumber, ownerName, manufacturer, price, fuelType); 
				arr.add(obj); 
				System.out.println("vehicle registered successfully");
			}else if(choice == 2) {
				if(arr.size() == 0) {
					System.out.println("No vehicle found");
				}else {
					for(Car c : arr) {
						System.out.println(c);
					}
				}
			}else if(choice == 3) {
				System.out.println("Enter registration Number:");
				String rNumber = scanner.next();
				boolean found = false; 
				for(Car car : arr) {
					if(car.registrationNumber.equals(rNumber)) {
						scanner.nextLine(); 
						System.out.println("New owner name:");
						car.ownerName = scanner.nextLine(); 
						System.out.print("New Price: ");
				        car.price = scanner.nextInt();
				        System.out.print("New Fuel Type: ");
				        car.fuelType = scanner.next();
				        found = true;
				        System.out.println("Vehicle updated successfully.");
				        break;
					}
				}
				if(!found) {
					System.out.println("Vehicle with Registration Number " + rNumber + " does not exist.");
				}	
			}else if(choice == 4) {
				System.out.print("Enter Registration Number: ");
				String reg = scanner.next();
				boolean found = false;
				for(int i=0;i<arr.size();i++)
				{
				    if(arr.get(i).registrationNumber.equals(reg))
				    {
				        arr.remove(i);
				        found = true;
				        System.out.println("Vehicle deleted successfully.");
				        break;
				    }
				}
				if(!found) {
					System.out.println("Vehicle with Registration Number " + reg + " does not exist.");
				}
			}else if(choice == 5) {
				System.out.print("Enter Registration Number: ");
				String reg = scanner.next();
				boolean found = false;
				for(Car car : arr)
				{
				    if(car.registrationNumber.equals(reg))
				    {
				        System.out.println(car);
				        found = true;
				        break;
				    }
				}
				if(!found) {
					System.out.println("Vehicle with Registration Number " + reg + " does not exist.");
				}
			}else if(choice == 6) {
				boolean found = false;
				for(Car car : arr)
				{
				    if(car.price > 1000000)
				    {
				        System.out.println(car);
				        found = true;
				    }
				}
				if(!found)
				{
				    System.out.println("No premium vehicles found.");
				}
			}else {
				System.out.println("Invalid Choice");
			}
		}while(choice != 7);
	}
}
