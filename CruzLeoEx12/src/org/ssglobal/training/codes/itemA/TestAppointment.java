package org.ssglobal.training.codes.itemA;

import java.time.LocalDate;

public class TestAppointment {

	public static void main(String[] args) {
		Appointment apt = new Appointment();
		LocalDate aptDate = LocalDate.of(2023, 01, 23);
		apt.addAppointment(aptDate, "Eye Check up");
		LocalDate aptDate1 = LocalDate.of(2022, 12, 23);
		apt.addAppointment(aptDate1, "Heart Check up");
		LocalDate aptDate3 = LocalDate.of(2024, 07, 26);
		apt.addAppointment(aptDate3, "Lung Chech up");
		apt.displayAppointment();

	}

}
