package org.ssglobal.training.codes.itemA;

public final class OrderedCake extends Cake{
	private double weight;
	private double discount;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public double calcPrice() {
		return rate * weight;
	}
	
	@Override
	public double computeDiscount() {
		return calcPrice() - discount;
	}

}
