package org.ssglobal.training.codes.itemB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class LocalBank {
	File file = new File("./src/files/localbankdb.txt");
	Scanner scan = new Scanner(System.in);
	
	public void displayMenu() {
		boolean isActive = true;
		while (isActive) {
			
			System.out.println("Deposit [d]");
			System.out.println("Withdrawal [w]");
			System.out.println("Add an account [a]");
			System.out.println("Remove an account [r]");
			System.out.println("Quit [q]\n");
			System.out.print("Enter choice: ");
			String input = scan.next();
			
			if (input.equalsIgnoreCase("d")) {
				deposit();
				break;
			} else if (input.equalsIgnoreCase("w")) {
				withdraw();
				break;
			} else if (input.equalsIgnoreCase("a")) {
				addAct();
				break;
			} else if (input.equalsIgnoreCase("r")) {
				removeAct();
				break;
			} else if (input.equalsIgnoreCase("q")) {
				isActive = false;
				System.out.println();
			}
			
		}
		
	}
	
	private void addAct() {
		System.out.print("First name: ");
		String fname = scan.next();
		System.out.print("Last name: ");
		String lname = scan.next();
		System.out.print("Beginning balance: ");
		int bal = scan.nextInt();
		
		String firsLet = fname.substring(0, 1).toUpperCase();
		StringBuilder sb = new StringBuilder(firsLet);
		StringBuilder lastName = new StringBuilder(lname);
		StringBuilder actID = sb.append(lastName);
		
		try {
			RandomAccessFile rac = new RandomAccessFile(file, "rw");
			long length = rac.length();
			rac.seek(length);
			
			rac.writeUTF("\n %s".formatted(actID.toString()));
			rac.writeUTF(fname);
			rac.writeUTF(lastName.toString());
			rac.writeInt(bal);
			
			rac.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Account created. Account ID is: %s".formatted(actID));
		System.out.println();
		displayMenu();
	}
	
	private void deposit() {
		System.out.print("Enter account ID: ");
		String actId = scan.next();
		System.out.print("Enter deposit amount: ");
		int dep = scan.nextInt();
		
		try {
			RandomAccessFile rac = new RandomAccessFile(file, "rw");
			rac.seek(0);
			long pos = 0;
			while (pos < rac.length()) {
				String actNameStr = rac.readUTF();
				
				if (actNameStr.equals(actId)) {
					System.out.println(actNameStr);
					
					pos = rac.getFilePointer();
				}
			}
			
			rac.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void withdraw() {
		
	}
	
	
	
	private void removeAct() {
		
	}
	
}
