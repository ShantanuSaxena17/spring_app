package com.billdesk.stringClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class CheckExceptionHandling {
	public static void main(String[] args) {
		String sampleFilePath = "C:\\Users\\shantanu.saxena\\Documents\\workspace-spring-tools-for-eclipse-5.2.0.RELEASE\\SimpleJavaApp\\src\\com\\billdesk\\stringClass\\sample.txt "; 
		File file = new File(sampleFilePath); 
		
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}catch(Exception e) {
			System.out.println("Some other exception occured");
		}
	}
}
