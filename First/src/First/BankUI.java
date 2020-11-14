package First;

import java.util.Scanner;

public class BankUI {
	private Scanner input;
	public BankUI() {
		input = new Scanner(System.in);
	}
	public int showMenu() {
		
		System.out.println("-----BANK MENU-----");
		System.out.println("--1. Open Account--");
		System.out.println("--2. List Accounts-");
		System.out.println("--3. Make Deposit--");
		System.out.println("------9. Exit------");
		
		System.out.println("Please enter your choice");
		return input.nextInt();
	}
	
	public void OpenAccount() {
		System.out.println("Open Account press any key");
		input.next();
	}
	
	public void ListAccounts() {
		System.out.println("List Accounts press any key");
		input.next();
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
