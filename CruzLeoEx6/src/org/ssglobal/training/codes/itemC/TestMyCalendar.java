package org.ssglobal.training.codes.itemC;

import java.util.Scanner;

public class TestMyCalendar {

	public static void main(String[] args) {
		MyCalendar mc = new MyCalendar();
		Scanner np = new Scanner(System.in);
		
		System.out.print("Enter Month: ");
		int inMonth = np.nextInt();		
		System.out.print("Enter Year:");
		int inYear = np.nextInt();
		mc.printCalendar(inMonth, inYear);
		
		np.close();

	}

}
