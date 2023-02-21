package org.ssglobal.training.codes.itemD;

public class TestAppendable {

	public static void main(String[] args) {
		MyListInt ml = new MyListInt();
		try {
			Integer[] num = {1, 2, 3, 4, 5};
			System.out.println(ml.append(num));
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
		
		MyString ms = new MyString();
		try {
			String[] strArr = {"Leo", "Cruz", "Orolfo"};
			System.out.println(ms.append(strArr));
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
		
	
		
	
	}

}
