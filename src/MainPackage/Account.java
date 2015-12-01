package MainPackage;

import java.util.Date;

public class Account {
	private double annualInterestRate;
	private double balance;
	private int id;
	
	Date dateCreated = new Date();
	Account(){	
	}
	
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	protected double getMonthlyInterestRate() {
		return getAnnualInterestRate()/12;
	}
	
	protected void withdraw(double amount) throws InsufficientFundsException{
		if (amount <= balance) {
			balance -= amount;
		}
		else {
			throw new InsufficientFundsException(amount - balance);
		}
	}
	
	protected void deposit(double amount) {
		balance += amount;
	}
}