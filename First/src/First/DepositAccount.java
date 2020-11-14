package First;

public class DepositAccount extends Account {

	public void Adjust(double adjustment) {
		double currentBalance = this.getBalance();
		currentBalance = currentBalance + adjustment;
		this.setBalance(currentBalance);
	}

	@Override
	public void Open(int accNum, double bal) {
		// TODO Auto-generated method stub
		this.setAccountNumber(accNum);
		this.setBalance(bal);
	}

}
