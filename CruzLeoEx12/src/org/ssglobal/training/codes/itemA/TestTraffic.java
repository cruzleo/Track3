package org.ssglobal.training.codes.itemA;

public class TestTraffic {

	public static void main(String[] args) {
		Traffic t = new Traffic();
		t.addCars("red car");
		t.addCars("blue car");
		t.addCars("green car");
		t.addCars("yellow car");
		t.removeCars();
		t.removeCars();
	}

}
