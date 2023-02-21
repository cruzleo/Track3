package org.ssglobal.training.codes.lambda;

public class TestGenerateIntegerStream {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 6, 8, 10, 12, 14, 15, 17, 19, 21 };
		GenerateIntegerStream gis = new GenerateIntegerStream();
		System.out.println("----------getDivByTwo-----------");
		gis.getDivByTwo(num);
		System.out.println("----------getDivByThree-----------");
		gis.getDivByThree(num);
		System.out.println("----------getDivByfive-----------");
		gis.getDivByFive(num);
		
		int[] num1 = { 10, 22, 31, 86, 18, 12, 41, 24, 55, 67, 89, 21 };
		System.out.println("----------getDivByTwo-----------");
		gis.getDivByTwo(num1);
		System.out.println("----------getDivByThree-----------");
		gis.getDivByThree(num1);
		System.out.println("----------getDivByfive-----------");
		gis.getDivByFive(num1);
	}

}
