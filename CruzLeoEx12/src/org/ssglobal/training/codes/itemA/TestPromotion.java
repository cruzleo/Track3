package org.ssglobal.training.codes.itemA;

public class TestPromotion {

	public static void main(String[] args) {
		Promotion pm = new Promotion();
		pm.addEmployee(100, "Leo Cruz");
		pm.addEmployee(79, "Tom Cat");
		pm.addEmployee(90, "Hikaru");
		pm.addEmployee(99, "Minari");
		pm.getBestEmployee();

	}

}
