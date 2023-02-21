package org.ssglobal.training.codes.itemA;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	private List<Object> invoice = new ArrayList<>();
	
	public void addProduct(String name, int qty, double price) {
		double total = qty * price;
		invoice.add(name);
		invoice.add(qty);
		invoice.add(price);
		invoice.add(total);
	}
	
	public void getInvoice() {
		System.out.println("%s\t%s\t%s\t%s".formatted("Name", "Qty", "Price", "Total"));
		for (int i = 0; i < invoice.size(); i++) {
			System.out.print("%s\t ".formatted(invoice.get(i)));
		}
		System.out.println();
	}
}

