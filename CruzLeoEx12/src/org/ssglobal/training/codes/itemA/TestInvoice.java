package org.ssglobal.training.codes.itemA;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice inv = new Invoice();
		
		inv.addProduct("Alcohol", 2, 100);
		inv.addProduct("Coffee", 3, 140);
		inv.addProduct("Keyboard", 10, 500);
		inv.getInvoice();
		

	}

}
