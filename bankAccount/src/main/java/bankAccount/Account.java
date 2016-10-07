package bankAccount;

import java.util.Date;


public class Account {
	
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	
	public Account(){
		dateCreated = new Date();
	}
	
	public Account(int idNbr){
		this();
		id = idNbr;
	}
	public Account(int customerId, double customerBalance){
		this(customerId);
		balance = customerBalance;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int customerId){
		id = customerId;
	}
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double customerBalance){
		balance = customerBalance;
	}
	
	public double getInterest(){
		return annualInterestRate;
	}
	public void setInterest(double currentInterest){
		annualInterestRate = currentInterest;
	}
	public double getMonthlyInterest(){
		return (annualInterestRate)/12;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double deposit(double depositAmount){
		balance += depositAmount;
		return balance;
	}
	public double withdraw(double withdrawAmount) throws InsufficientFundsException{
		if(balance >= withdrawAmount){
			balance -= withdrawAmount;
			return balance;
		}
		else{
			double overDraw = withdrawAmount - this.balance; 
			throw new InsufficientFundsException(overDraw);
		}
	}
}
