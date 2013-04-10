package assignments.chap10;

import java.util.Scanner;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;

	Account() {
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate / 100;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		this.balance = balance - amount;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
	}

	public void withdrawOperation() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw: ");
		double amount = input.nextInt();
		this.withdraw(amount);

	}

	public void depositOperation() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount to deposit: ");
		double amount = input.nextInt();
		this.deposit(amount);
	}

}
