package org.ssglobal.training.codes.itemA;

import java.util.Scanner;

public class MetricConversion {
	
	public void showMenu() {
		Scanner np = new Scanner(System.in);
		boolean isShow = true;
		
		do {
			System.out.print("Enter a number: ");
			int inputNum = np.nextInt();
			System.out.println();
			System.out.println("Convert: ");
			System.out.println("1. Inches to Centimeters \t5. Centimeters to Inches");
			System.out.println("2. Feet to Centimeters \t\t6. Centimeters to Feet");
			System.out.println("3. Yards to Meters \t\t7. Meters to Yards");
			System.out.println("4. Miles to Kilometers \t\t8. Kilometers to Miles");
			System.out.println();
			System.out.print("Enter your choice: ");
			int choice = np.nextInt();
			System.out.println();
			
			if (choice < 9) {
				convertNum(inputNum, choice);
				isShow = false;
			} else {
				isShow = false;
			}
			
			np.close();
		} while (isShow);
	}
	
	private void convertNum(int num, int choice) {
		float inToCen = 0;
		float ftToCen = 0;
		float yarToMet = 0;
		float milToKm = 0;
		float cenToInc = 0;
		float cenToFt = 0;
		float metToYar = 0;
		float kmToMil = 0;
		
		if (choice == 1) {
			inToCen = (float) (num * 2.54);
			System.out.println("%d inche(s) equals %.2f centimeters.".formatted(num, inToCen));
		} else if (choice == 2) {
			ftToCen = num * 30;
			System.out.println("%d feet equals %.2f centimeters.".formatted(num, ftToCen));
		} else if (choice == 3 ) {
			yarToMet = (float) (num * 0.91);
			System.out.println("%d yard(s) equals %.2f meters.".formatted(num, yarToMet));
		} else if (choice == 4) {
			milToKm = (float) (num * 1.6);
			System.out.println("%d mile(s) equals %.2f kilometers.".formatted(num, milToKm));
		} else if (choice == 5) {
			cenToInc = (float) (num / 2.54);
			System.out.println("%d centimeter(s) equals %.2f inches.".formatted(num, cenToInc));
		} else if (choice == 6) {
			cenToFt = (float) (num / 30.48);
			System.out.println("%d centimeter(s) equals %.2f feet.".formatted(num, cenToFt));
		} else if (choice == 7) {
			metToYar = (float) (num * 1.09);	
			System.out.println("%d meter(s) equals %.2f yards.".formatted(num, metToYar));
		} else if (choice == 8) {
			kmToMil = (float) (num / 1.61);
			System.out.println("%d kilometer(s) equals %.2f miles.".formatted(num, kmToMil));
		}
	}
	
}
