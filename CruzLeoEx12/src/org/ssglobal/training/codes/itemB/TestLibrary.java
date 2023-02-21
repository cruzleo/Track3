package org.ssglobal.training.codes.itemB;

public class TestLibrary {

	public static void main(String[] args) {
		Library lib = new Library();
		Book book = new Book("PostCard Killer", 1234, "James Patterson", 2, "Penguin inc.", "1999-01-22");
		lib.addBook(book);
		Book book2 = new Book("Divergent", 54675, "Veronica Roth", 1, "Publish co.", "2000-08-22");
		lib.addBook(book2);
		Book book3 = new Book("Insurgent", 9856, "Veronica Roth", 3, "Publish co.", "2010-03-12");
		lib.addBook(book3);
		System.out.println(lib.getBooks());
		
		lib.deleteBook(54675);
		System.out.println(lib.getBooks());
		
		Book bookUpdate = new Book("Percy Jackson", 1234, "Rick Riordan", 2, "Penguin inc.", "2012-09-18");
		lib.updateBook(1234, bookUpdate);
		System.out.println(lib.getBooks());
		
	}

}
