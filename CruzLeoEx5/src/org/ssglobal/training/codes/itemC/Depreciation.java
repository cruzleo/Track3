package org.ssglobal.training.codes.itemC;

public class Depreciation {
	public void depriciate() {
		int endOfYearVal = 28000;
		int dep = 4000;
		int acumulated = 0;
		int counter = 1;
		
		System.out.format("%5s \t%-5s \t%-5s \t%5s\n", "Year", "Depreciation", "End-if-year value",
				"Accumulated depreciation");
		System.out.format("%5s\t%5s\t%5s\t\t%5s\n", "----", "------------", "------------", "------------");

		while (counter <= 7) {
			endOfYearVal = endOfYearVal - dep;
			acumulated = acumulated + dep;
			System.out.format("%3d \t%7d \t  %-7d \t\t  %-1d\n", counter, dep, endOfYearVal, acumulated);
			counter++;
		}
	}

}
