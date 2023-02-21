package org.ssglobal.training.codes.itemA;

public class TestLibrary {

	public static void main(String[] args) {
		Author author1 = null;
		Author author2 = null;
		Author author3 = null;
//		Author author4 = null;
//		Author author5 = null;
//		Author author6 = null;
		try {
			System.out.println("-------------Authors-----------------");
			author1 = Author.getAuthorInstace("J.k Rowling", "rwoling@email", 'F');
			author2 = Author.getAuthorInstace("Veronica Ruth", "vRuth@email", 'F');
			author3 = Author.getAuthorInstace("Rick Riordan", "rRiordan@email", 'M');
//			author4 = Author.getAuthorInstace("J.k Rowling", "rwoling@email", 'F');
//			author5 = Author.getAuthorInstace("J.k Rowling", "rwoling@email", 'F');
//			author6 = Author.getAuthorInstace("J.k Rowling", "rwoling@email", 'F');
			System.out.println(author1.toString());
			System.out.println(author2);
			System.out.println(author3);
		} catch (AuthorException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("-------------Books-----------------");
			Book book1 = Book.getBookInstance("Harry Potter", author1, 600.00, 300);
			Book book2 = Book.getBookInstance("Divergent", author2, 250.00, 500);
			Book book3 = Book.getBookInstance("Percy Jackson", author3, 450.00, 100);
//			Book book4 = Book.getBookInstance("Harry Potter", author1, 500.00, 300);
//			Book book5 = Book.getBookInstance("Harry Potter", author1, 500.00, 300);
//			Book book6 = Book.getBookInstance("Harry Potter", author1, 500.00, 300);
			System.out.println(book1.toString());
			System.out.println(book2);
			System.out.println(book3);
		} catch (BookException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
