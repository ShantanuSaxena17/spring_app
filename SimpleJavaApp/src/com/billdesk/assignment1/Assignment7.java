package com.billdesk.assignment1;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int StudentId; 
	String studentName; 
	int Marks; 
	
	Student(int StudentId, String studentName, int Marks){
		this.StudentId = StudentId; 
		this.studentName = studentName; 
		this.Marks = Marks; 
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}
	
}
public class Assignment7 {
	public static void main(String[] args) {
		System.out.println("========= Student Management =========");
		System.out.println("1. Add Student");
		System.out.println("2. View All Students");
		System.out.println("3. Update Student");
		System.out.println("4. Delete Student");
		System.out.println("5. Exit");
		System.out.println("======================================");
		Scanner scanner = new Scanner(System.in); 
		int choice = scanner.nextInt(); 
		ArrayList<Student>students = new ArrayList<>(); 
		while(choice != 5) {
			if(choice == 1) {
				students.add();
			}
		}
		
		
	}
}
