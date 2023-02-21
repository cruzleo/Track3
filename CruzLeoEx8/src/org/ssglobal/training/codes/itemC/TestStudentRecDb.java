package org.ssglobal.training.codes.itemC;

public class TestStudentRecDb {

	public static void main(String[] args) {
		StudentsRecDb stud = new StudentsRecDb();
		String fileName = "sem-1-2021.txt";
		System.out.println(stud.queryHighetAverage(fileName));

	}

}
