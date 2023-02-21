package org.ssglobal.training.codes.itemA;


public class TestCake {

	public static void main(String[] args) {
		OrderedCake oc = new OrderedCake();
		oc.setName("Strawberry Cake");
		oc.setRate(300.00);
		oc.setDiscount(100.00);
		oc.setWeight(5.2);
		System.out.println("Cake and rate: %s".formatted(oc.toString()));
		System.out.println("Total price: %.2f".formatted(oc.calcPrice()));
		System.out.println("Total price - discount: %.2f".formatted(oc.computeDiscount()));
		
		System.out.println("-----------ReadyMadeCake-----------");
		ReadyMadeCake rc = new ReadyMadeCake();
		rc.setName("Chocolate Cake");
		rc.setQuantity(5);
		rc.setRate(350);
		System.out.println("Cake and rate: %s".formatted(rc.toString()));
		System.out.println("Total price: %.2f".formatted(rc.calcPrice()));
		System.out.println("Total price - discount: %.2f".formatted(rc.computeDiscount()));
		
		System.out.println("-----------WholesaleCake-----------");
		WholesaleCake wc = new WholesaleCake();
		wc.setName("Mocha");
		int[] cakePrc = {100, 200, 300, 350, 600};
		wc.setCake(cakePrc);
		int[] dicount =  {10, 20, 30, 50, 60};
		wc.setDiscount(dicount);
		wc.setRate(120.00);
		System.out.println("Cake and rate: %s".formatted(wc.toString()));
		System.out.println("Total price: %.2f".formatted(wc.calcPrice()));
		System.out.println("Total price - discount: %.2f".formatted(wc.computeDiscount()));
		
	
	}

}
