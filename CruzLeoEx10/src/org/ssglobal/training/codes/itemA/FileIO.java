package org.ssglobal.training.codes.itemA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	public void transactIO() {
		int n = 10;
		int[] v = new int[n];
	
		try (FileReader f = new FileReader("./src/files/datum.txt");
			BufferedReader in = new BufferedReader(f);) {
			int i = 0;
			String linea = null;
			
			try {
				linea = in.readLine();
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			} 
			
			try {
				while (linea != null) {
					v[i] = Integer.parseInt(linea);
					linea = in.readLine();
					i++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		
	}
}	
