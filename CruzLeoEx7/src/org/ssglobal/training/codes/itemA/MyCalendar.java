package org.ssglobal.training.codes.itemA;

import java.time.LocalDate;

public class MyCalendar {
	
	public void printCalendar(int year, int months) {
		LocalDate inputDate = LocalDate.of(year, months, 1);
		int weekDay = inputDate.getDayOfWeek().getValue();
		System.out.println();
		System.out.println("\t%s %d".formatted(inputDate.getMonth(), inputDate.getYear())); 
		System.out.println("Su Mo Tu We Th Fr Sa");
		
		for (int i = 0; i < weekDay; i++) {
			if (weekDay == 7) {
				System.out.print("%s".formatted(""));
			} else {
				System.out.print("%3s".formatted(""));
			}
		}
		
		int days = inputDate.getMonth().length(inputDate.isLeapYear());
		
		for (int day = 1; day <= days; day++) {
			System.out.print("%-3d".formatted(day));
			
			if ((day + weekDay) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
