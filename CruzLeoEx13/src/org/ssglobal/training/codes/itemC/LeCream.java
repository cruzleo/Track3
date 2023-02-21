package org.ssglobal.training.codes.itemC;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LeCream {
	public static final int WAFER_PRICE = 10;
	private int noOfWafer;
	private Map<LeCreamDeApp, Integer> order = new EnumMap<>(LeCreamDeApp.class);
	
	public void displayMenu() {
		
		try(Scanner scan = new Scanner(System.in);) {
			do {
				System.out.println("Chocolate \t[A/a]");
				System.out.println("Vanilla \t[B/b]");
				System.out.println("Strawberry \t[C/c]");
				System.out.println("Mango \t\t[D/d]");
				System.out.println("Tutti Fruit \t[E/e]");
				System.out.println("Almond Crunch \t[F/f]");
				System.out.println("Coffee \t\t[G/g]");
				System.out.println("Exit \t\t[H/h]");
				System.out.print("Enter flavor: ");
				String choice = scan.next();
				
				if (choice.equalsIgnoreCase("H")) {
					break;
				}
				
				System.out.print("How many Scoops: ");
				int noOfScoops = scan.nextInt();
				if (noOfScoops > 3 ) {
					throw new PayFirstAdditionExcepition();
				}
				
				System.out.print("Additional wafer: ");
				noOfWafer = scan.nextInt();
				
				switch (choice.toLowerCase()) {
					case "a":
						if (order.containsKey(LeCreamDeApp.CHOCOLATE)) {
							order.replace(LeCreamDeApp.CHOCOLATE, noOfScoops);
						} else {
							order.put(LeCreamDeApp.CHOCOLATE, 1);
						}
						computeTotal();
						break;
					case "b":
						if (order.containsKey(LeCreamDeApp.VANILLA)) {
							order.replace(LeCreamDeApp.VANILLA, noOfScoops);
						} else {
							order.put(LeCreamDeApp.VANILLA, 1);
						}
						computeTotal();
						break;
					case "c": 
						if (order.containsKey(LeCreamDeApp.STRAWBERRY)) {
							order.replace(LeCreamDeApp.STRAWBERRY, noOfScoops);
						} else {
							order.put(LeCreamDeApp.STRAWBERRY, 1);
						}
						computeTotal();
						break;
					case "d":
						if (order.containsKey(LeCreamDeApp.MANGO)) {
							order.replace(LeCreamDeApp.MANGO, noOfScoops);
						} else {
							order.put(LeCreamDeApp.MANGO, 1);
						}
						computeTotal();
						break;
					case "e":
						if (order.containsKey(LeCreamDeApp.TUTTI_FRUIT)) {
							order.replace(LeCreamDeApp.TUTTI_FRUIT, noOfScoops);
						} else {
							order.put(LeCreamDeApp.TUTTI_FRUIT, 1);
						}
						computeTotal();
						break;
					case "f":
						if (order.containsKey(LeCreamDeApp.ALMOND_CRUNCH)) {
							order.replace(LeCreamDeApp.ALMOND_CRUNCH, noOfScoops);
						} else {
							order.put(LeCreamDeApp.ALMOND_CRUNCH, 1);
						}
						computeTotal();
						break;
					case "g":
						if (order.containsKey(LeCreamDeApp.COFFEE)) {
							order.replace(LeCreamDeApp.COFFEE, noOfScoops);
						} else {
							order.put(LeCreamDeApp.COFFEE, 1);
						}
						computeTotal();
						break;
				}
				
			} while (true);
		
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		} catch (PayFirstAdditionExcepition e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void computeTotal() {
		double total = 0;
		double totalWafer = 0;
		
		Iterator<Entry<LeCreamDeApp, Integer>> iterator = order.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<LeCreamDeApp, Integer> sold = iterator.next();
			totalWafer = noOfWafer * WAFER_PRICE;
			int noOfScoop = sold.getValue();
			double pricePerScoop = sold.getKey().getPrice();
			total = total + pricePerScoop * noOfScoop + totalWafer;
		}
		System.out.println();
		System.out.println("Total: %f\n".formatted(total));
	
	}
	
}

class PayFirstAdditionExcepition extends Exception{
	private static final long serialVersionUID = 32444699872944180L;
private String message = "can only order 2-3 scoops";
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}
