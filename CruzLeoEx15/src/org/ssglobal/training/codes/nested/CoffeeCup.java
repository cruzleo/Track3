package org.ssglobal.training.codes.nested;

import java.util.ArrayList;
import java.util.Iterator;

public class CoffeeCup<E> {
	private ArrayList<E> innerObject = new ArrayList<>();

	public CoffeeCup(ArrayList<E> innerObject) {
		this.innerObject = innerObject;
	}

	@SuppressWarnings("unchecked")
	public void add(Object o) {
		innerObject.add((E) o);
	}

	public Iterator<E> getIterator() {
		return new CoffeeCupIterator(this);
	}

	ArrayList<E> getObject() {
		return this.innerObject;
	}

	@Override
	public String toString() {
		return this.innerObject.toString();
	}

	class CoffeeCupIterator implements Iterator<E> {
		private CoffeeCup<E> myCup;
		private int temp = 0;

		public CoffeeCupIterator(CoffeeCup<E> myCup) {
			this.myCup = myCup;
		}

		@Override
		public boolean hasNext() {
			if (temp < myCup.getObject().size()) {
				return true;
			}
			return false;
		}

		@Override
		public E next() {
			return (E) myCup.getObject().get(temp++);
		}

		public void remove() {
			myCup.getObject().remove(--temp);
		}
	}
}
