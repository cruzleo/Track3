package org.ssglobal.training.codes.itemB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.ssglobal.training.codes.itemB.Exception.LineTooLongException;
import org.ssglobal.training.codes.itemB.Exception.SpaceCharException;

public class ReadFileLines {
	public void readPerChar() throws SpaceCharException, LineTooLongException, Exception {
		String filePath = "./src/files/sample.txt";
		File file = new File(filePath);
		
		try (FileReader fr = new FileReader(file);
			){
			char[] buffer = new char[(int) file.length()];
			fr.read(buffer);
			
			try {
				if (file.length() >= 81) {
					throw new LineTooLongException();
				} else {
					for (char lookup : buffer) {
						if (lookup == ' ') {
							throw new SpaceCharException();
						}
					}
				} 
			} catch (SecurityException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.print(new String(buffer));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
	
}
