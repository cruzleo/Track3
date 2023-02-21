package org.ssglobal.training.codes.itemB;

import java.io.IOException;

public class Mileage {
	String fname;
	double pricePerGallon;
	double amountPaid;
	int initialOdometer;
	int finalOdometer;

	int totalMiles;
	double totalGasUsed;
	double milesPerGallon;

	public void computeMileage() {
		totalMiles = finalOdometer - initialOdometer;
		totalGasUsed = amountPaid / pricePerGallon;
		milesPerGallon = totalMiles / totalGasUsed;

	}

	public void inputDetails() {

		try {
			byte[] input = new byte[1000];
			byte[] inputName = new byte[1000];
	
			System.out.print("Enter your name: ");
			System.in.read(inputName);
			fname = new String(inputName);

			System.in.skipNBytes(System.in.available());

			System.out.print("Enter price per gallon: ");
			System.in.read(input);
			String priceVal = new String(input);
			pricePerGallon = Double.parseDouble(priceVal);

			System.in.skipNBytes(System.in.available());

			System.out.print("Enter total price per fill up: ");
			System.in.read(input);
			String amountPaidVal = new String(input);
			amountPaid = Double.parseDouble(amountPaidVal);

			System.in.skipNBytes(System.in.available());

			System.out.print("Enter initial odometer value: ");
			System.in.read(input);
			String initialOdoVal = new String(input);
			initialOdometer = (int) Double.parseDouble(initialOdoVal);

			System.in.skipNBytes(System.in.available());

			System.out.print("Enter final odometer value: ");
			System.in.read(input);
			String finalOdoVal = new String(input);
			finalOdometer = (int) Double.parseDouble(finalOdoVal);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void printDetail() {
		System.out.format("%s, you drove %d miles using\n", fname.trim(), totalMiles);
		System.out.format("%f gallons with an mpg of %f", totalGasUsed, milesPerGallon);
	}
}
