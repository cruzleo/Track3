package org.ssglobal.training.codes.threads;

public class BasPrinter {
	public synchronized void print() {
		System.out.print("-");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.print("|");
	}
}
