package com.billdesk.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWritingDemo {
	public static void main(String[] args) {
		try(
		Scanner scanner = new Scanner(System.in);
		FileReader fr = new FileReader("C:\\Users\\shantanu.saxena\\Documents\\workspace-spring-tools-for-eclipse-5.2.0.RELEASE\\SimpleJavaApp\\src\\com\\billdesk\\fileIO\\input.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\shantanu.saxena\\Documents\\workspace-spring-tools-for-eclipse-5.2.0.RELEASE\\SimpleJavaApp\\src\\com\\billdesk\\fileIO\\input.txt", true));
		BufferedReader br = new BufferedReader(fr); 
		)
		{
			 
			String str = scanner.nextLine();
			
			bw.write(str); 
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			scanner.close();
		}catch(FileNotFoundException e){
			System.out.println("File Not Found!");
		}catch(Exception e) {
			System.out.println("Error found");
		}
	}
}
