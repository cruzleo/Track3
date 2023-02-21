package org.ssglobal.training.codes.itemA;

public class TestSavingAccount {

	public static void main(String[] args) {
		SavingAccount SavingAcct = new SavingAccount(); // set to 0.0, 0.0
		System.out.println(SavingAcct.getBalance());
		System.out.println(SavingAcct.getInterestRate());
		System.out.println("---------------------------------");
		SavingAccount SavingAcct2 = new SavingAccount(500.00, 0.4); 
		SavingAcct2.deposit(10_000.00);
		System.out.println("New Balance: %f".formatted(SavingAcct2.getBalance()));
		SavingAcct2.addInterest(0.5);
		System.out.println("New interest rate: %f".formatted(SavingAcct2.getInterestRate()));
		System.out.println("New Balance + new interest rate: %f".formatted(SavingAcct2.getBalance()));
		SavingAcct2.withdraw(10_000.00);
		System.out.println("New Balance after withdrawal: %f".formatted(SavingAcct2.getBalance()));
		
	
	}
}
