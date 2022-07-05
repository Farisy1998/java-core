package com.executerframework;

public class CheckProcessorTask implements Runnable {

	String name;

	public CheckProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " CheckProcessor has began processing check " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println(name + " CheckProcessor has completed processingthe check " + Thread.currentThread().getName());
	}

}
