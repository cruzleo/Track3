package org.ssglobal.training.codes.itemA;

public sealed abstract class Cake permits OrderedCake, ReadyMadeCake, WholesaleCake {
	protected String name;
	protected double rate;

	public abstract double calcPrice();
	public abstract double computeDiscount();

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public String toString() {
		return name + "\t" + rate;
	}

}
