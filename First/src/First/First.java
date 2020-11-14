package First;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankUI ui = new BankUI();
		
		int response;
		response = ui.showMenu();
		
		while (response != 9) {
			switch(response ) {
			case 1:
					ui.OpenAccount();
					break;
			case 2: 
					ui.ListAccounts();
					break;
			case 3: 
					ui.MakeDeposit();
					break;
			default: 
					ui.InvalidMenuChoice();
					break;
			}
			if (response != 9) {
				response = ui.showMenu();
			}
		}
		
		ui.Exit();
		
		
	}

}
