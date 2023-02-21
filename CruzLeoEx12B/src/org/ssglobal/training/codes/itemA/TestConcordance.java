package org.ssglobal.training.codes.itemA;

import java.util.Scanner;

public class TestConcordance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Concordance concords = new Concordance();
		
		System.out.print("Enter string: ");
		String input = scan.nextLine();
		System.out.println(concords.concord(input));
		scan.close();
	}

}
