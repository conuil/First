package First;

import java.util.ArrayList;
import java.util.Scanner;

public class BankUI {
	private Scanner input;
	private Bank myBank;
	public BankUI() {
		input = new Scanner(System.in);
		myBank = new Bank();
	}
	public int showMenu() {
		
		System.out.println("-----BANK MENU-----");
		System.out.println("--1. Open Deposit Account--");
		System.out.println("--2. List Accounts-");
		System.out.println("--3. Make Deposit--");
		System.out.println("------9. Exit------");
		
		System.out.println("Please enter your choice");
		return input.nextInt();
	}
	
	public void OpenAccount() {
		System.out.println("Open Account please specify opening balance");
		double balance =0;
		try {
			balance = Double.parseDouble(input.next());
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid Balance (not numeric). Returning to Main Menu.");
			return;
		}
		DepositAccount d = new DepositAccount();
		d.Open(myBank.getNextAccountNumber(), balance);
		myBank.getAccounts().add(d);
	}
	
	public void ListAccounts() {
		ArrayList<Account> banksAccounts = myBank.getAccounts();
		System.out.println("List of Accounts at the Bank");
		for(Account a : banksAccounts) {
			System.out.println(a.toString());
		}
	}
	
	public void MakeDeposit() {
		System.out.println("Make Deposit press any key");
		input.next();
	}	
	
	public void Exit() {
		System.out.println("GoodBye");
	}
	
	public void InvalidMenuChoice() {
		System.out.println("Invalid Menu Choice");
	}
}
