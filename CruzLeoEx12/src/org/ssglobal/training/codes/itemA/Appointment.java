package org.ssglobal.training.codes.itemA;

import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Appointment {
	private Map<LocalDate, String> appointment = new TreeMap<>();

	public void addAppointment(LocalDate apt, String event) {
		appointment.put(apt, event);
	}
	
	public void removeAppointment(LocalDate date) {
		appointment.remove(date);
	}
	
	public void updateAppointment(LocalDate date, String event) {
		appointment.replace(date, event);
	}
	
	public void displayAppointment() {
		for (Entry<LocalDate, String> lookup: appointment.entrySet()) {
			LocalDate key = lookup.getKey();
			String value = lookup.getValue();
			System.out.println("%s = %s".formatted(key, value));
		}
	}
}
