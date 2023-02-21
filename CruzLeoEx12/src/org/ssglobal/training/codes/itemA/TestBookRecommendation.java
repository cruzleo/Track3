package org.ssglobal.training.codes.itemA;

public class TestBookRecommendation {

	public static void main(String[] args) {
		BookRecommendation br = new BookRecommendation();
		br.addBook(5, "Harry Potter");
		br.addBook(2, "Percy Jackson");
		br.addBook(1, "Diary of a wimpy kid");
		br.addBook(7, "Divergent");
		br.favBook();
	}

}
