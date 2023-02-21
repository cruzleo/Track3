package org.ssglobal.training.codes.itemA;

import java.util.LinkedList;
import java.util.List;

public class DeckCards {
	private List<String> listCards = new LinkedList<>();
	
	public void addCards(String card) {
		listCards.add(0, card);
	}
	
	public void getLast() {
		System.out.println(listCards.remove(listCards.size() - 1));
	}
	
	public void displayCards() {
		for (int i = 0; i < listCards.size(); i++) {
			System.out.print("%s ".formatted(listCards.get(i)));
		}
		System.out.println();
	}
}	
