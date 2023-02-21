package org.ssglobal.training.codes.itemD;

import java.io.IOException;

public class CovidDetector {
	
	public void verifyCOVID() {
		String input = "";
		StringBuilder temp = new StringBuilder(""); 
		String strand1 = new String("GAATTC");
		String strand2 = new String("GATCC");
	
		try {
			byte[] newInput = new byte[1000];
			
			System.out.print("Enter DNA strand sample: ");
			System.in.read(newInput);
			input = new String(newInput);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		if (input.toUpperCase().contains(strand1)) {
			System.out.format("GAATTC found on : %d ", temp.indexOf(strand1));
		} else if (input.toUpperCase().contains(strand2)) {
			System.out.format("GATCC found on : %d ", temp.indexOf(strand2));
		}
		
	}
}
