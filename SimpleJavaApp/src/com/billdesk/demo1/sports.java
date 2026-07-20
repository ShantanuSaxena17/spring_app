package com.billdesk.demo1;

import java.util.Scanner; 

class sport{
	public String type;
	public int NoOfPlayer; 
	public boolean teamOrNoTeam; 
    
	sport(){
		System.out.println("Default constructor");
	}
	sport(String type, int NoOfPlayer, boolean teamOrNoTeam){
		this.type = type;
		this.NoOfPlayer = NoOfPlayer; 
		this.teamOrNoTeam = teamOrNoTeam; 
	}
	public void displayDetails() {
		System.out.println("type: " + type);
		System.out.println("NoOfPlayer: "+ NoOfPlayer);
		System.out.println("teamOrNoTeam: "+ teamOrNoTeam);
	}
}
public class sports {
	public static void main(String[] args) {
		System.out.println("Enter details: ");
		Scanner sc = new Scanner(System.in); 
		String type = sc.nextLine();
		int NoOfPlayer = sc.nextInt(); 
		boolean teamOrNoTeamString = sc.nextBoolean(); 
		
		sport a = new sport(type, NoOfPlayer, teamOrNoTeamString); 
		a.displayDetails();
		sc.close(); 
	}
}
