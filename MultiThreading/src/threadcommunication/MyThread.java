package threadcommunication;

public class MyThread extends Thread {
	int total = 0;

	public void run() {
		System.out.println("Child thread is calculating the sum: ");
		System.out.println("Child thread is going to aquire the sync lock");
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				total += i;
			}
			this.notify();	// Notify the Child thread to Main thread that it's execution
							// has been completed and releasing the lock for the Main thread
			System.out.println("Child thread invoked the notify() method");
		}
	}
}
