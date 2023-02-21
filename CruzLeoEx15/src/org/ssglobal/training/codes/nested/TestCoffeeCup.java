package org.ssglobal.training.codes.nested;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCoffeeCup {

	public static void main(String[] args) {
		ArrayList<String> innerObject = new ArrayList<>();
		innerObject.add("Black Tea");
		innerObject.add("Green Tea");
		innerObject.add("Chamomile Tea");

		CoffeeCup<String> cc = new CoffeeCup<>(innerObject);
		System.out.println(cc.toString());

		cc.add("Milk Tea");
		cc.add("Hibiscus Tea");
		cc.add("Oolong Tea");
		System.out.println(cc.toString());

		Iterator<String> iterator = cc.getIterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.println(temp);

			if (temp.equalsIgnoreCase("Milk Tea")) {
				iterator.remove();
			}
		}
		System.out.println(cc);
	}
}
