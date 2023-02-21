package org.ssglobal.training.codes.itemA;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MultiCalendar {
	private Map<LocalDate[], String[]> multiCal = new TreeMap<>();
	
	public void addEvents(LocalDate[] dates, String[] eventName) {
		multiCal.put(dates, eventName);
	}
	
	public void removeEvents(LocalDate[] dates) {
		multiCal.remove(dates);
	}
	
	public void updateEvents(LocalDate[] dates, String[] eventName) {
		multiCal.replace(dates, eventName);
	}
	
	public void displayEvents() {
		for (Entry<LocalDate[], String[]> lookup: multiCal.entrySet()) {
			LocalDate[] key = lookup.getKey();
			String[] value = lookup.getValue();
			System.out.print("%s = %s".formatted(key, value));
		}
	}
	
}
