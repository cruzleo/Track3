package org.ssglobal.training.codes.itemB;

public class Matrix <T> {
	private T[][] values;
	private int rows;
	private int cols;
	
	@SuppressWarnings("unchecked")
	public void create(int r, int c) {
		rows = r;
		cols = c;
		values = (T[][]) new Object[rows][cols];
	}
	
	public void set(int r, int c, T v) throws ArrayIndexOutOfBoundsException, NumberFormatException, Exception{
		try {
			values[r][c] = v;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public T get(int r, int c) throws ArrayIndexOutOfBoundsException, NumberFormatException, Exception{
		try {
			return (T) values[r][c];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
