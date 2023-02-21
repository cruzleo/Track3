package org.ssglobal.training.codes.itemA;

import java.util.PriorityQueue;
import java.util.Queue;

public class Traffic {
	private Queue<String> qCars = new PriorityQueue<>();
	
	public void addCars(String cars) {
		qCars.offer(cars);
	}
	
	public void removeCars() {
		if (!qCars.isEmpty()) {
			System.out.println(qCars.peek());
			qCars.poll();
		}
	}
}
