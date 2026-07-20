package com.billdesk.fileIO;

class Container<T>{
	T sampleObj; 
	
	public Container(T sampleObj) {
		this.sampleObj = sampleObj; 
	}
	public T getObject() {
		return this.sampleObj; 
	}
	public void log() {
		System.out.println("object type is: " + this.sampleObj.getClass().getSimpleName());
		
	}
}
class Person{
	int id; 
	String name; 
	
}
public class GenericExample1 {
	public static void main(String[] args) {
		String samplString= "some sample container"; 
		Container<String> strContainer= new Container<>(samplString);
		Container<Integer> intContainer = new Container<>(10); 
		Container<Person> personContainer = new Container(new Person(1, "Shantanu")); 
		
	}
}
