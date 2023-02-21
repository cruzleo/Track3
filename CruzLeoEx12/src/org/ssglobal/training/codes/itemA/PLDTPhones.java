package org.ssglobal.training.codes.itemA;

import java.util.ArrayList;
import java.util.List;

public class PLDTPhones {
	private List<String> phoneNum = new ArrayList<>();
	
	public void addPhone(String Num) {
		phoneNum.add(Num);
	}
	
	public void updatePhone(String oldNum, String newNum) {
		for (int i = 0; i < phoneNum.size(); i++) {
			if (phoneNum.get(i).equals(oldNum)) {
				phoneNum.set(i, newNum);
			}
		}
	}
	
	public void removePhone(String Num) {
		phoneNum.remove(Num);
	}
	
	public void displayPhoneNumbers() {
		for (int i = 0; i < phoneNum.size(); i++) {
			System.out.print("%s ".formatted(phoneNum.get(i)));
		}
		System.out.println();
	}
}
