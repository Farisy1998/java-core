package yield;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child thread: " + i + "th time");
			Thread.yield();	// yield() method will stop the execution of the current 
							// thread and give the chance to the waiting thread with 
							// same priority
		}
	}
}
