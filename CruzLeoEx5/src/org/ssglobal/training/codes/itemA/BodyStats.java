package org.ssglobal.training.codes.itemA;

import java.io.IOException;

public class BodyStats {
	private char gender;
	private int heightInFeet;
	private int heightInInch;
	private short weight;
	private short height;

	public boolean normalWeight(int actualWeight) {
		short weightBelowIdeal = (short) (actualWeight - (weight * 0.15F));
		short weightAboveIdeal = (short) (actualWeight + (weight * 0.15F));
		
		if (actualWeight >= weightBelowIdeal && actualWeight <= weightAboveIdeal) {
			return true;
		}
		return false;
	}

	public void computeWeight() {
		height = (short) ((heightInFeet * 12) + heightInInch - 60);

		if (gender == 'f' || gender == 'F') {
			final byte FEMALE_WEIGHT = 100;
			
			if (heightInInch == 0) {
				weight = (short) (heightInFeet + FEMALE_WEIGHT);
				System.out.format("Weight: %d %s", weight, "pounds");
			} else {
				weight = (short) (FEMALE_WEIGHT + (height * 5));
				System.out.format("Weight: %d %s", weight, "pounds");
			}


		} else if (gender == 'm' || gender == 'M') {
			final byte MALE_WEIGHT = 106;
			
			if (heightInInch == 0) {
				weight = (short) (heightInFeet + MALE_WEIGHT);
				System.out.format("Weight: %d %s", weight, "pounds");
			} else {
				weight = (short) (MALE_WEIGHT + (height * 6));
				System.out.format("Weight: %d %s", weight, "pounds");
			}
		}

		System.out.println();
	}

	public void inputHeight() {
		try {
			byte[] input = new byte[1000];

			System.out.print("Enter your gender F or M: ");
			gender = (char) System.in.read();

			if (gender == 'f' || gender == 'F') {
				System.in.skipNBytes(System.in.available());

				System.out.print("Enter your height in feet: ");
				System.in.read(input);
				String heightFeet = new String(input);
				heightInFeet = (int) Double.parseDouble(heightFeet);

				System.in.skipNBytes(System.in.available());

				System.out.print("Enter your height in Inches: ");
				System.in.read(input);
				String heightInch = new String(input);
				heightInInch = (int) Double.parseDouble(heightInch);

				computeWeight();

			} else if (gender == 'm' || gender == 'M') {
				System.in.skipNBytes(System.in.available());

				System.out.print("Enter your height in feet: ");
				System.in.read(input);
				String heightFeet = new String(input);
				heightInFeet = (int) Double.parseDouble(heightFeet);

				System.in.skipNBytes(System.in.available());

				System.out.print("Enter your height in Inches: ");
				System.in.read(input);
				String heightInch = new String(input);
				heightInInch = (int) Double.parseDouble(heightInch);

				computeWeight();

			} else {
				System.out.println("Not a gender");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
