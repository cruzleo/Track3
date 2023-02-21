package org.ssglobal.training.codes.itemA;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class SqrtFile {
	
	public void computeSqrt(float num) {
		float sqrt = (float) Math.sqrt(num);
		
		DecimalFormat df1 = new DecimalFormat("###,###.0");
		String sqrtStr = df1.format(sqrt);
		String numStr = df1.format(num);
		System.out.println("Square root of %s = %s".formatted(numStr, sqrtStr));
		
		File file = new File("./src/files/number.dat");
		
		try {
			FileOutputStream fos = new FileOutputStream(file, true);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeFloat((float) sqrt);
			dos.flush();
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		System.out.println("The square root value of %s wrote to the file \"number.dat\"".formatted(sqrtStr));
	}
	
	public void returnSqr() {
		File file = new File("./src/files/number.dat");
		DecimalFormat df1 = new DecimalFormat("###,###.0");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
			float sqrtVal = 0;
			float numVal = 0;
			while (dis.available() > 0) {
				sqrtVal = dis.readFloat();
				numVal = (float) Math.pow(sqrtVal, 2); 
			}
			
			String sqrtStr = df1.format(sqrtVal);
			String numStr = df1.format(numVal);
			
			System.out.println("\nThe value read from the file \"number.dat\": %s".formatted(sqrtStr));
			System.out.println("A square number of %s = %s".formatted(sqrtStr, numStr));
			
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
