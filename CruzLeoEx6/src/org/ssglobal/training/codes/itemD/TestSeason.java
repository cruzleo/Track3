package org.ssglobal.training.codes.itemD;

import java.util.Scanner;

public class TestSeason {

	public static void main(String[] args) {
		Season s = new Season();
		Scanner np = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = np.nextInt();
		System.out.print("Enter month: ");
		int month = np.nextInt();
		System.out.print("Enter day: ");
		int day = np.nextInt();
		
		System.out.println(s.identifySeason(year, month, day));
		
		np.close();

	}

}
