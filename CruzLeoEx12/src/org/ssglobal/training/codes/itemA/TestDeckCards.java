package org.ssglobal.training.codes.itemA;

public class TestDeckCards {

	public static void main(String[] args) {
		DeckCards dc = new DeckCards();
		dc.addCards("2 Hearts");
		dc.addCards("King of Spade");
		dc.addCards("Queen of Hearts");
		dc.addCards("8 Diamond");
		dc.displayCards();
		dc.getLast();
		dc.displayCards();
		dc.addCards("2 Hearts");
		dc.displayCards();
	}

}
