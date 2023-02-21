package org.ssglobal.training.codes.threads;

public class TestBarPrinter {

	public static void main(String[] args) {
		BasPrinter p = new BasPrinter();
		
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				while (true) {
					p.print();
				}
			}
		};
		
		Thread w1 = new Thread(task1);
		Thread w2 = new Thread(task1);
		
		try {
			w1.start();
			w1.join();
			w2.start();
			w2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

}
