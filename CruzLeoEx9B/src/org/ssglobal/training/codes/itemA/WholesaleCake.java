package org.ssglobal.training.codes.itemA;

public sealed class WholesaleCake extends Cake permits OrderedWholesaleCake, CustomWholesaleCake {
	private int[] Cake;
	private int[] discount;
	
	public int[] getCake() {
		return Cake;
	}
	
	public void setCake(int[] cake) {
		Cake = cake;
	}
	
	public int[] getDiscount() {
		return discount;
	}
	
	public void setDiscount(int[] discount) {
		this.discount = discount;
	}
	
	@Override
	public double calcPrice() {
		double rateVal = 0;
		int len = Cake.length;
		
		if (len >= 5) {
			for (int i = 0; i < len; i++) {
				rateVal = rate * Cake[i];
			}
			return rateVal;
		}
		return 0;
	}
	
	@Override
	public double computeDiscount() {
		double disVal = 0;

		if (Cake.length >= 5) {
			for (int i = 0; i < discount.length; i++) {
				disVal = disVal + discount[i];
			}
			return calcPrice() - disVal;
		}
		return 0;
	}

}
