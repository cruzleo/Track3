package org.ssglobal.training.codes.itemC;

public enum LeCreamDeApp {
	CHOCOLATE("Chocolate", 60.00, 1000), 
	VANILLA("Vanilla", 50.00, 1000), 
	STRAWBERRY("Strawberry", 50.00, 1000), 
	MANGO("Mango", 50.00, 1000), 
	TUTTI_FRUIT("Tutti Fruit", 50.00, 1000), 
	ALMOND_CRUNCH("Almond Crunch", 50.00, 1000), 
	COFFEE("Coffee", 50.00, 1000);
	
	private String flavor;
	private Integer noOfScoops;
	private Double price;
	private Integer stock;
	
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public Integer getNoOfScoops() {
		return noOfScoops;
	}

	public void setNoOfScoops(Integer noOfScoops) {
		this.noOfScoops = noOfScoops;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	private LeCreamDeApp(String flavor, Double price, Integer stock) {
		this.flavor = flavor;
		this.price = price;
		this.stock = stock;
	}
}
