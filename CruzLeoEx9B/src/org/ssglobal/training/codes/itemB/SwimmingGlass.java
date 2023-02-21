   package org.ssglobal.training.codes.itemB;

public non-sealed class SwimmingGlass extends SportVisionShoppe{
	private char type;
	private String style;
	
	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public double calCharges() {
		double price = 0;
		
		if (type == 'A' || type == 'a') {
			if (style.equalsIgnoreCase("Retro")) {
				double dis = 150.00 * 0.07;
				price = 150.00 - dis;
				return depositPymt - price;
				
			} else if (style.equalsIgnoreCase("Warrior")) {
				double dis = 150.00 * 0.30;
				price = 150.00 - dis;
				return depositPymt - price;
				
			} else if (style.equalsIgnoreCase("Modern")) {
				double dis = 150.00 * 0.10;
				price = 150.00 - dis;
				return depositPymt - price;
			}
			
		} else if (type == 'S' || type == 's') {
			if (style.equalsIgnoreCase("Retro")) {
				double dis = 250.00 * 0.05;
				price = 250.00 - dis;
				return depositPymt - price;
				
			} else if (style.equalsIgnoreCase("Warrior")) {
				double dis = 250.00 * 0.20;
				price = 250.00 - dis;
				return depositPymt - price;
				
			} else if (style.equalsIgnoreCase("Modern")) {
				double dis = 250.00 * 0.07;
				price = 250.00 - dis;
				return depositPymt - price;
			}
			
		}
		
		return 0;
	}
	
	public String toString() {
		return "Order no: %s \nOrder date: %s\nGlass type: %s \nStyle: %s".formatted(custOrderNo, custOrderDate, type, style);
	}

}
