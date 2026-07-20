package com.billdesk.assignment1;

class Account{
	private int accountNumber; 
	private String accountHolderName; 
	private int balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(int accountNumber, String accountHolderName, int balance) {
		this.accountNumber = accountNumber; 
		this.accountHolderName = accountHolderName; 
		this.balance = balance; 
	}	
}
class SavingAccount extends Account{
	public SavingAccount(int accountNumber, String accountHolderName, int balance) {
		super(accountNumber, accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}

	private int interestRate; 
	
}
class CurrentAccount extends Account{
	public CurrentAccount(int accountNumber, String accountHolderName, int balance) {
		super(accountNumber, accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}

	private int overdraftLimit; 
}
public class Assignment10 {
	public static void main(String[] args) {
		
	}
}
