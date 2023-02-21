package org.ssglobal.training.codes.itemB;

public class TestMatrix {

	public static void main(String[] args) {
		Matrix<Character> mat1 = new Matrix<Character>();
		try {
			mat1.create(5, 5);
			mat1.set(0, 0, 'z');
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(mat1.get(0, 0));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Matrix<Double> mat2 = new Matrix<Double>();
		try {
			mat2.create(7, 7);
			mat2.set(2, 3, 10.2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(mat2.get(2, 3));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Matrix<String> mat3 = new Matrix<String>();
		try {
			mat3.create(7, 7);
			mat3.set(2, 2, "Leo");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(mat3.get(2, 2));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
