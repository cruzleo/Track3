package org.ssglobal.training.codes.itemA;

import java.util.Arrays;

public class TestMyFilter {
	
	public static void main(String[] arg) {
		MyFilter mf = new MyFilter();
		String[] strVal = new String[] {"hello", "list", "zzz"};
		System.out.println(Arrays.toString(MyFilter.filter(strVal, mf)));
	}
}
