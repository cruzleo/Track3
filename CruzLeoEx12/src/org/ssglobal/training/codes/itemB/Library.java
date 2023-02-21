package org.ssglobal.training.codes.itemB;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books = new ArrayList<>();
	
	public boolean addBook(Book book) {
		return books.add(book);
	}
	
	
	public List<Book> deleteBook(int ISBN) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).ISBN() == ISBN) {
				books.remove(i);
				return books;
			}
		}
		return books;
	}
	
	public boolean updateBook(int ISBN, Book book) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).ISBN() == ISBN) {
				books.set(i, book);
				return true;
			}
		}
		return false;
	}
	
	public List<Book> getBooks() {
		return books;
	}
}
