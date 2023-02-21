package org.ssglobal.training.codes.itemA;

public non-sealed class ReadyMadeCake extends Cake {
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public double calcPrice() {
		return rate * quantity;
	}
	
	@Override
	public double computeDiscount() {
		return calcPrice() - (0.10 * calcPrice());
	}

}
