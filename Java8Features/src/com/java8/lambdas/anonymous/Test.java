package com.java8.lambdas.anonymous;

public class Test {

	public static void main(String[] args) {
		// Instant coding
		Thread t = new Thread(
				// anonymous format of run() in Runnable interface
				()->{
					for(int i=1;i<=10;i++) {
						System.out.println("Inside Child thread");
					}
				}
		);
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Indside Main thread");
		}
	}

}
