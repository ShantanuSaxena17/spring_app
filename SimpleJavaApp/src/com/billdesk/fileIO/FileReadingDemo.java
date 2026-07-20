package com.billdesk.fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadingDemo {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:\\Users\\shantanu.saxena\\Documents\\workspace-spring-tools-for-eclipse-5.2.0.RELEASE\\SimpleJavaApp\\src\\com\\billdesk\\fileIO\\input.txt")){
			int nextChar; 
			while((nextChar = fr.read()) != -1) {
				System.out.println((char) nextChar);
			}
			
		}
		catch(FileNotFoundException e) {
			
			System.out.println("the file was not found");
		}
		catch(Exception e) {
			System.out.println("some exception occured");
		}
		finally {
			System.out.println("Operation completed");
		}
		
	}
}
