package First;

public abstract class Account {
	private int accountNumber;
	private double balance;
	
	public abstract void Open(int accNum,double bal);
	
	public String PrintBalance() {
		return "Current Balance " + balance;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountNumber(int accNum) {
		accountNumber = accNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBal) {
		balance = newBal;
	}
	
	@Override
	public String toString() {
		return("Account Number: " + accountNumber + " Balance: " + balance);
	}
}
