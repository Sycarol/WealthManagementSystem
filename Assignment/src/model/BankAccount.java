package model;

public class BankAccount extends Saving implements Asset{
	private String accountNo;
	private String bankName;
	private double balance;
	private double interestRate;
	
	public BankAccount(String accountNo, String bankName, double balance, double interestRate) {
		this.accountNo = accountNo;
		this.bankName = bankName;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateMonetaryValue()
	{
		double total = 0;
		
		try {
			 total = this.balance * (1 + this.interestRate);
		}catch(ArithmeticException e) {
			System.out.println("Please Check Value key in to the system, Error in Calculating your Monetary Value.");
		}
		
		return total;
	}
	
	public void deposit(double amount)
	{
		
	}
	
	public void withdraw(double amount)
	{
		
	}
}
