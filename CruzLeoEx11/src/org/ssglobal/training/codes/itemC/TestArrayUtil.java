package org.ssglobal.training.codes.itemC;

public class TestArrayUtil {
	
	public static void main(String[] args) {
		
		try {
			String result1 = ArrayUtil.getCentral(new String[] {"Leo", "Cruz", "Orolfo"});
			System.out.println(result1);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Character result2 = ArrayUtil.getCentral(new Character[] {'L', 'E', 'O'});
			System.out.println(result2);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		try {
			Integer result3 = ArrayUtil.getCentral(new Integer[] {1, 2, 3, 4, 5});
			System.out.println(result3);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
