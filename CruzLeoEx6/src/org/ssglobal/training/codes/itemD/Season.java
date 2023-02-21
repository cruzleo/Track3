package org.ssglobal.training.codes.itemD;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Season {
	public String identifySeason(int year, int month, int day) {
		Calendar today = new GregorianCalendar(year, month, day);
		Calendar springStrt = new GregorianCalendar(year, 2, 16);
		Calendar springEnd = new GregorianCalendar(year, 5, 15);
		Calendar winterStrt = new GregorianCalendar(year, 11, 16);
		Calendar winterEnd = new GregorianCalendar(year, 2, 15);
		Calendar summerStrt = new GregorianCalendar(year, 5, 16);
		Calendar summerEnd = new GregorianCalendar(year, 8, 15);
		Calendar fallStrt = new GregorianCalendar(year, 8, 16);
		Calendar fallEnd = new GregorianCalendar(year, 11, 15);
		winterStrt.roll(Calendar.MONTH, 1);
		winterEnd.add(Calendar.YEAR, 1);
	
		if ((today.after(winterStrt) && today.before(winterEnd)) || (today.equals(winterStrt) || today.equals(winterEnd))) {
			return "Winter";
		} else if ((today.after(springStrt) && today.before(springEnd)) || (today.equals(springStrt) || today.equals(springEnd))) {
			return "Spring";
		} else if ((today.after(summerStrt) && today.before(summerEnd)) || (today.equals(summerStrt) || today.equals(summerEnd))) {
			return "Summer";
		} else if ((today.after(fallStrt) && today.before(fallEnd)) || (today.equals(fallStrt) || today.equals(fallEnd))){
			return "Fall";
		} else {
			return "Enter another";
		}
		
		
	}
}
