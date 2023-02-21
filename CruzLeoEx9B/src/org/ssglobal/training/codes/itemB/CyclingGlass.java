package org.ssglobal.training.codes.itemB;

public final class CyclingGlass extends SportVisionShoppe{
	private char type_glass;
	private boolean uvProtection;
	
	public char getType_glass() {
		return type_glass;
	}

	public void setType_glass(char type_glass) {
		this.type_glass = type_glass;
	}

	public boolean isUvProtection() {
		return uvProtection;
	}

	public void setUvProtection(boolean uvProtection) {
		this.uvProtection = uvProtection;
	}

	@Override
	public double calCharges() {
		double price = 0;
		
		if (type_glass == 'T' || type_glass ==  't') {
			if (uvProtection == true) {
				price =   300.00 + 30;
			} else {
				price = 300.00;
			}
			return depositPymt - price;
			
		} else if (type_glass == 'P' || type_glass == 'p') {
			if (uvProtection == true) {
				price =   350.00 + 30;
			} else {
				price = 350.00;
			}
			return depositPymt - price;
			
		} else if (type_glass == 'I' || type_glass == 'i') {
			if (uvProtection == true) {
				price =   400.00 + 30;
			} else {
				price = 400.00;
			}
			return depositPymt - price;
		}
		return 0;
	}
	
	public String toString() {
		return "Order no: %s \nOrder date: %s\nType of Glass: %s \nUv potection: %s".formatted(custOrderNo, custOrderDate, type_glass, uvProtection);
	}
}
