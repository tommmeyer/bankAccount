package bankAccount;


public class InsufficientFundsException extends Exception {

private double shortfall;
public InsufficientFundsException(double overDraw){
	this.shortfall = overDraw;
	System.out.println("Insufficient funds! You are $" + this.shortfall + "too poor to withdraw this");
}
}
