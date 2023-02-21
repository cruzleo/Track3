package org.ssglobal.training.codes.itemD;

public class MyListInt implements IAppendable<Integer>{

	@Override
	public Integer append(Integer[] a) {
		if (a instanceof Integer[]) {
			String conStr = "";
			Integer intVal = null;
			try {
				Integer[] val = (Integer[]) a;
				for (Integer lookup : val) {
					conStr = String.join("", conStr, lookup.toString());
				}
				intVal = Integer.parseInt(conStr);
			} catch (ClassCastException e) {
				throw new ClassCastException("cannot cast raw type to Integer");
			}
			return intVal;
		} else {
			return null;
		}
	
	}



}
