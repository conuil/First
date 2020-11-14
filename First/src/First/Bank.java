package First;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private int nextAccountNumber = 0;
	
	public ArrayList<Account> getAccounts(){
		return accounts;
	}
	
	public int getNextAccountNumber() {
		return nextAccountNumber++;
	}
}
