package org.ssglobal.training.codes.itemB;

import java.text.DecimalFormat;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		DecimalFormat f1 = new DecimalFormat("\u0024###,###.00");
		
		System.out.println("-----------------0.04 Interest rate---------------------");
		saver1.setSavingsBalance(2000.00F);
		saver2.setSavingsBalance(3000.00F);
		SavingsAccount.modifyInterestRate(0.04F);
		
		float acct1Bal = saver1.getSavingsBalance();
		saver1.calculateMonthlyInterest();
		float acct1NewBal = saver1.getSavingsBalance();
		String acct1Str = f1.format(acct1Bal);
		String acct1NewBalStr = f1.format(acct1NewBal);
		System.out.println("Saver 1 Balance: %s".formatted(acct1Str));
		System.out.println("Saver 1 New Balance after calculation: %s".formatted(acct1NewBalStr));

		float acct2Bal = saver2.getSavingsBalance();
		saver2.calculateMonthlyInterest();
		float acct2NewBal = saver2.getSavingsBalance();
		String acct2Str = f1.format(acct2Bal);
		String acct2NewBalStr = f1.format(acct2NewBal);
		System.out.println("Saver 2 Balance: %s".formatted(acct2Str));
		System.out.println("Saver 2 New Balance after calculation: %s".formatted(acct2NewBalStr));
		
		System.out.println("-----------------Update interest to 0.05---------------------");
		
		SavingsAccount.setAnnualInterestRate(0.05F);
		SavingsAccount.modifyInterestRate(0.05F);
		acct1Bal = saver1.getSavingsBalance();
		saver1.calculateMonthlyInterest();
		acct1NewBal = saver1.getSavingsBalance();
		acct1Str = f1.format(acct1Bal);
		acct1NewBalStr = f1.format(acct1NewBal);
		System.out.println("Saver 1 Balance: %s".formatted(acct1Str));
		System.out.println("Saver 1 New Balance after calculation: %s".formatted(acct1NewBalStr));

		acct2Bal = saver2.getSavingsBalance();
		saver2.calculateMonthlyInterest();	
		acct2NewBal = saver2.getSavingsBalance();
		acct2Str = f1.format(acct2Bal);
		acct2NewBalStr = f1.format(acct2NewBal);
		System.out.println("Saver 2 Balance: %s".formatted(acct2Str));
		System.out.println("Saver 2 New Balance after calculation: %s".formatted(acct2NewBalStr));

	}
}
