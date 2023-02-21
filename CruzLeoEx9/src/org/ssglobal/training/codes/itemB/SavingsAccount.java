package org.ssglobal.training.codes.itemB;

public class SavingsAccount {
	private static float annualInterestRate;
	private float savingsBalance; 
	
	public static float getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public static void setAnnualInterestRate(float annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	
	public float getSavingsBalance() {
		return savingsBalance;
	}
	
	public void setSavingsBalance(float savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public float calculateMonthlyInterest() {
		float monthlyInterest = 0;
		
		monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance = savingsBalance + monthlyInterest;
		return monthlyInterest;
	}
	
	public static void modifyInterestRate(float interest) {
		annualInterestRate = interest;
	}
}
