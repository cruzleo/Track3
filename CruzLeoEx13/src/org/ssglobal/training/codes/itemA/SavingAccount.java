package org.ssglobal.training.codes.itemA;

public class SavingAccount {
	private Double balance;
	private Double interestRate;
	
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingAccount(Double balance, Double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public SavingAccount() {
		this(0.0, 0.0);
	}
	
	public Double deposit(Double dep) {
		balance = balance + dep;
		return balance;
	}
	
	public Double withdraw(Double amt) {
		if (amt < balance) {
			balance = balance - amt;
		} else {
			System.out.println("Insuffient balance");
		}
		return balance;
	}
	
	public Double addInterest(Double interestRate) {
		this.interestRate = interestRate;
		this.interestRate = balance * this.interestRate / 12;
		balance = balance + this.interestRate;
		return interestRate;
	}
	
}
