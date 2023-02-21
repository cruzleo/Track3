package org.ssglobal.training.codes.itemC;

public class ArrayUtil {
	public static<E> E getCentral(E[] a) throws ClassCastException, Exception{ 
		if (a instanceof String[]) {
			if (a == null || a.length == 0) {
				return null;
			} 
			
			try {
				return (E) (a[a.length/2]);
			} catch (ClassCastException e) {
				throw new ClassCastException("cannot cast raw type to String");
			}
			
		} else if (a instanceof Character[]) {
			if (a == null || a.length == 0) {
				return null;
			} 
			
			try {
				return (E) (a[a.length/2]);
			} catch (ClassCastException e) {
				throw new ClassCastException("cannot cast raw type to Character");
			}
		} else if (a instanceof Integer[]) {
			if (a == null || a.length == 0) {
				return null;
			} 
			
			try {
				return (E) (a[a.length/2]);
			} catch (ClassCastException e) {
				throw new ClassCastException("cannot cast raw type to Integer");
			}
		} else {
			return null;
		}
		
	}
} 

