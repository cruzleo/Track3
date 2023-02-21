package org.ssglobal.training.codes.itemA;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class BookRecommendation {
	private Map<Integer, String> bookReco = new TreeMap<>();
	
	public void addBook(int freqOfRead, String bookName) {
		bookReco.put(freqOfRead, bookName);
	}
	
	public void favBook() {
		Iterator<String> iterateVal = bookReco.values().iterator();
		String value = "";
		while (iterateVal.hasNext()) {
			value = iterateVal.next();
		}
		System.out.println("Your favorite book is: %s".formatted(value));
	}
}	
