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
		try (Scanner scan = new Scanner(System.in);) {
			int noOfScoops = 0;
			int counter = 0;
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
				noOfScoops = scan.nextInt();
				
				while (noOfScoops <= 3) {
//					for (int i = 1; i <= noOfScoops; i++) {
						switch (choice.toLowerCase()) {
						case "a":
							if (order.containsKey(LeCreamDeApp.CHOCOLATE)) {
								int val = order.get(LeCreamDeApp.CHOCOLATE);
								order.replace(LeCreamDeApp.CHOCOLATE, ++val);
							} else {
								order.put(LeCreamDeApp.CHOCOLATE, 1);
							}
							counter++;
							noOfScoops++;
							break;
						case "b":
							if (order.containsKey(LeCreamDeApp.VANILLA)) {
								int val = order.get(LeCreamDeApp.VANILLA);
								order.replace(LeCreamDeApp.VANILLA, ++val);
							} else {
								order.put(LeCreamDeApp.VANILLA, 1);
							}
							counter++;
							noOfScoops++;
							break;
						case "c":
							if (order.containsKey(LeCreamDeApp.STRAWBERRY)) {
								int val = order.get(LeCreamDeApp.STRAWBERRY);
								order.replace(LeCreamDeApp.STRAWBERRY, ++val);
							} else {
								order.put(LeCreamDeApp.STRAWBERRY, 1);
							}
							counter++;
							noOfScoops++;
							break;
						case "d":
							if (order.containsKey(LeCreamDeApp.MANGO)) {
								int val = order.get(LeCreamDeApp.MANGO);
								order.replace(LeCreamDeApp.MANGO, ++val);
							} else {
								order.put(LeCreamDeApp.MANGO, 1);
							}
							counter++;
							noOfScoops++;
							break;
						case "e":
							if (order.containsKey(LeCreamDeApp.TUTTI_FRUIT)) {
								int val = order.get(LeCreamDeApp.TUTTI_FRUIT);
								order.replace(LeCreamDeApp.TUTTI_FRUIT, ++val);
							} else {
								order.put(LeCreamDeApp.TUTTI_FRUIT, 1);
							}
							counter++;
							noOfScoops++;
							break;
						case "f":
							if (order.containsKey(LeCreamDeApp.ALMOND_CRUNCH)) {
								int val = order.get(LeCreamDeApp.ALMOND_CRUNCH);
								order.replace(LeCreamDeApp.ALMOND_CRUNCH, ++val);
							} else {
								order.put(LeCreamDeApp.ALMOND_CRUNCH, 1);
							}
							counter++;
							noOfScoops++;
							break;
						case "g":
							if (order.containsKey(LeCreamDeApp.COFFEE)) {
								int val = order.get(LeCreamDeApp.COFFEE);
								order.replace(LeCreamDeApp.COFFEE, ++val);
							} else {
								order.put(LeCreamDeApp.COFFEE, 1);
							}
							counter++;
							noOfScoops++;
							break;
						}
						
						System.out.print("Additional wafer: ");
						noOfWafer = scan.nextInt();
				}	
//					}
//				} else {
//					throw new PayFirstAdditionExcepition();
				

			} while (true);
			computeTotal();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		} //catch (PayFirstAdditionExcepition e) {
//			System.out.println(e.getMessage());
//			
//		}
	}

	public void computeTotal() {

		double total = 0;
		Iterator<Entry<LeCreamDeApp, Integer>> iterator = order.entrySet().iterator();
		while (iterator.hasNext()) {
			double totalWafer = 0;
			Entry<LeCreamDeApp, Integer> sold = iterator.next();
			totalWafer = noOfWafer * WAFER_PRICE;
			int noOfScoops = sold.getValue();
			double pricePerScoop = sold.getKey().getPrice();
			total = total + pricePerScoop * noOfScoops + totalWafer;
			System.out.println("Flavor: %s PricePerScoop: %f no. of scoops: %d Price: %f".formatted(sold.getKey().getFlavor(),
					sold.getKey().getPrice(), noOfScoops,  pricePerScoop * noOfScoops));
		}
		System.out.println();
		System.out.println("Total: %f\n".formatted(total));
	}
}

class PayFirstAdditionExcepition extends Exception {
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


// using for loop sa noOsScoops para kahit anong flavor kung ilang yung scoops
// continue pag nag throw ng PayFirstException
