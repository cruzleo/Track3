package org.ssglobal.training.codes.itemA;

public class MyFilter implements IFilter<CharSequence> {

	@Override
	public boolean accept(CharSequence x) {
		if (x instanceof CharSequence) {
			String strX = (String) x;
			StringBuilder strx1 = (StringBuilder) x;
			
			if (strX.length() >= 3) {
				return true;
			} else if (strX.endsWith("S")) {
				return true;
			} else if (strx1.reverse().toString().equals(strX)) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	
	}
	
	@SuppressWarnings("unchecked")
	public static <E extends CharSequence> E[] filter(E[] a, IFilter<CharSequence> f) {
		String[] aStr = (String[]) a;
		int counter = 0;

		for(String lookup : aStr) {
			if (f.accept(lookup)) {
				counter++;
			}
		}
		String[] temp = new String[counter];
		for (int i = 0; i < aStr.length; i++) {
			if (f.accept(aStr[i])) {
				temp[i] = aStr[i];
			}
		}
		return (E[]) temp;
		
	}


	

}
