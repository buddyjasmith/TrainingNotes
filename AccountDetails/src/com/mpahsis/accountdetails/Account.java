package com.mpahsis.accountdetails;

public class Account {
	int accountNo;
    public double balance;
    public String accountType;
	public static int counter = 0;
	public Account( double balance, String accountType) {
		super();
		setCounter();
		this.accountNo = getCounter();
		this.balance = balance;
		this.accountType = accountType;
	}

	public static int getCounter() {
		return counter;
	}
	public void depositAmount(double amount) {
		this.balance += amount;
		System.out.println(("New Balance : " + balance + "\n"));
	}
	public void printAccountDetails() {
		System.out.println("[Acct No : " + accountNo + ", Type : " + accountType
							+ ", Balance : " + balance + "]");
							
	}
	public static void setCounter(int count) {
		Account.counter = count;
	} 
	public static void setCounter() {
		Account.counter++;
	}
}
