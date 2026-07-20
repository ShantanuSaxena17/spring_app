package com.billdesk.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Employee{
	int id; 
	String name; 
	int salary; 
	
	public Employee(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
		this.id = id; 
		this.name = name; 
		this.salary = salary; 
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, Employee> myMap = new HashMap<>();
		Employee e1 = new Employee(1,  "someone", 10000); 
		Employee e2 = new Employee(2,  "another", 20000);
		Employee e3 = new Employee(3,  "newone", 30000);
		
		myMap.put(1, e1); 
		myMap.put(2, e2); 
		myMap.put(3, e3); 
		
		myMap.entrySet(); 
		myMap.keySet(); 
		myMap.values(); 
		
		for(Entry<Integer, Employee> e : myMap.entrySet()) {
			System.out.println(e);
		}
	}
}
