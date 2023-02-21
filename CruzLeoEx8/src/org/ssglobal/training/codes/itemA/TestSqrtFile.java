package org.ssglobal.training.codes.itemA;

import java.util.Scanner;

public class TestSqrtFile {

	public static void main(String[] args) {
		SqrtFile sf = new SqrtFile();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		float input = scan.nextFloat();
		sf.computeSqrt(input);
		System.out.print("--------------------------------------------");
		sf.returnSqr();
		
		scan.close();

	}

}
