package org.ssglobal.training.codes.itemD;

public class MyString implements IAppendable<String>{

	@Override
	public String append(String[] a) {
		if (a instanceof String[]) {
			String conStr = "";
			try {
				String[] val = (String[]) a;
				for (String lookup : val) {
					conStr = String.join("", conStr, lookup.toString());
				}
			} catch (ClassCastException e) {
				throw new ClassCastException("cannot cast raw type to String");
			}
			return conStr;
		} else {
			return null;
		}
	}

	


}
