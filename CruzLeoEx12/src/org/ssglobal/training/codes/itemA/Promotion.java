package org.ssglobal.training.codes.itemA;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Promotion {
	private Map<Integer, String> employeesName = new TreeMap<>();
	
	public void addEmployee(int meritScore, String name) {
		employeesName.put(meritScore, name);
	}
	
	public void getBestEmployee() {
		Iterator<String> iterateVal = employeesName.values().iterator();
		String value = "";
		while (iterateVal.hasNext()) {
			value = iterateVal.next();
		}
		System.out.println("Employee with best performace(Promoted): %s".formatted(value));
	}
}
