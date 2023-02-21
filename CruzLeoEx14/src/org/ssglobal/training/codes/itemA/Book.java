package org.ssglobal.training.codes.itemA;

public class Book {
	private String name;
	private Author author;
	private Double price;
	private Integer qtyInStock;
	private static int counter = 1;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(Integer qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	private Book(String name, Author author, Double price, Integer qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public static Book getBookInstance(String name, Author author, Double price, Integer qtyInStock) throws BookException, Exception{
		if (counter <= 5) {
			counter++;
			return new Book(name, author, price, qtyInStock);
		} else {
			throw new BookException();
		}
	}
	
	@Override
	public String toString() {
		return "%s by %s price: %f Stock: %d".formatted(name, author, price, qtyInStock);
	}
}

class BookException extends Exception{
	static final long serialVersionUID = 3268506081844289570L;
	private String message = "can only instantiate five times";
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}