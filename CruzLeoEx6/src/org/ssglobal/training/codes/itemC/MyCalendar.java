package org.ssglobal.training.codes.itemC;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCalendar {
	public void printCalendar(int month, int year) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
							"November", "December"};
		
		System.out.println("\t%s %d".formatted(months[month - 1], year));
		System.out.println("Su Mo Tu We Th Fr Sa");
		
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month + 1);
		int dayOfMnths = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWk = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 0; i < dayOfWk; i++) {
			if (dayOfWk == 7) {
				System.out.print("%s".formatted(""));
			} else {
				System.out.print("%3s".formatted(""));
			}
		}
		
		for (int i = 1; i <= dayOfMnths; i++) {
			System.out.print("%-3d".formatted(i));
			
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println(dayOfMnths);
	}
}
