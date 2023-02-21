package org.ssglobal.training.codes.itemC;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Random;

public class RandomList<E> extends AbstractList<E> {

	@SuppressWarnings("unchecked")
	private E[] elementData = (E[]) new Object[0];

	@Override
	public int size() {
		return elementData.length;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(E e) {
		try {
			E[] tempArr = (E[]) new Object[elementData.length + 1];
			System.arraycopy(elementData, 0, tempArr, 0, elementData.length);
			tempArr[elementData.length] = e;

			for (int i = 0; i < tempArr.length; i++) {
				Integer random = new Random().nextInt(elementData.length + 1);
				E tempIndex = tempArr[random];
				tempArr[random] = tempArr[i];
				tempArr[i] = tempIndex;
			}
			elementData = tempArr;
			return true;
		} catch (Exception ex) {
			System.err.print(ex.getMessage());
		}
		return false;
	}

	@Override
	public E get(int index) {
		if (index >= elementData.length) {
			throw new IndexOutOfBoundsException();
		}

		if (index < 0) {
			throw new NegativeArraySizeException();
		}

		E value = elementData[index];
		return value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean remove(Object o) {
		try {
			int occurrence = 0;
			for (E lookup : elementData) {
				if (lookup.equals(o) || lookup.equals(null)) {
					occurrence++;
				} else {
					continue;
				}
			}

			E[] temp = (E[]) new Object[elementData.length - occurrence];
			int j = 0;
			for (E lookup : elementData) {
				if (lookup.equals(o)) {
					continue;
				}
				temp[j] = lookup;
				j++;
			}
			elementData = temp;
			temp = null;
			return true;
		} catch (Exception e) {
			System.err.print(e.getMessage());
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E remove(int index) {
		E[] temp = (E[]) new Object[elementData.length - 1];
		E oldval = null;
		if (index >= elementData.length) {
			throw new IndexOutOfBoundsException();
		}

		if (index < 0) {
			throw new NegativeArraySizeException();
		}

		int j = 0;
		for (int i = 0; i < elementData.length; i++) {
			if (index == i) {
				continue;
			}
			oldval = (E) temp[index];
			temp[j++] = elementData[i];
		}
		elementData = temp;
		temp = null;

		return oldval;
	}
}
