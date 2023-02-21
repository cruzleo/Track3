package org.ssglobal.training.codes.itemB;

public class TestFileReader {

	public static void main(String[] args) {
		ReadFileLines rf = new ReadFileLines();
		try {
			rf.readPerChar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
