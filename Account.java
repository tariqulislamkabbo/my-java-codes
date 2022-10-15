public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	//setter
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	//getter
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}

}