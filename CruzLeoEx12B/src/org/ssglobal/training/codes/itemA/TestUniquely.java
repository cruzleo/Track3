package org.ssglobal.training.codes.itemA;

public class TestUniquely {

	public static void main(String[] args) {
		Uniquely un = new Uniquely();
		
		System.out.println(un.createUniques("Leo cruz "));
		System.out.println(un.createUniques("for for for the"));
		System.out.println(un.createUniques("the fox jumps over the window"));
		System.out.println(un.createUniques("this is unique sentence"));
	}
}
