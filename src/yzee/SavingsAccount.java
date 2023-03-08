package yzee;

public class SavingsAccount  extends Account {
	private double mininumBalance;
	
	/*public SavingsAccount(int accountNumber, String customerObj, double balance) {
		super(accountNumber, customerObj, balance);
		// TODO Auto-generated constructor stub
	}*/
public SavingsAccount(int accountNumber, Customer customerObj, double balance, double mininumBalance) {
	super(accountNumber, customerObj, balance);
	this.mininumBalance = mininumBalance;
}

public double getMininumBalance() {
	return mininumBalance;
}

public void setMininumBalance(double mininumBalance) {
	this.mininumBalance = mininumBalance;
}

public boolean withdraw(double amount) {
	if(mininumBalance < amount) {
	balance=balance-amount;
	System.out.println("balance:"+ balance);
	 return  true;
	}
	return false;
	}
	
}


