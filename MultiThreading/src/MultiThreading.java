
public class MultiThreading extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MultiThreading mt1 = new MultiThreading();
		mt1.setPriority(MIN_PRIORITY);
		mt1.start(); // start() method is used to start every thread
		mt1.setName("mt1");

		MultiThreading mt2 = new MultiThreading();
		mt2.setPriority(MAX_PRIORITY);
		mt2.start(); // start() method is used to start every thread
		mt2.setName("mt2");

//		Thread currentThread = Thread.currentThread();
//		currentThread.setName("First thread");
//		System.out.println("Thread name is: " + currentThread.getName());
//		for (int j = 1; j <= 200; j++) {
//			System.out.print("j: " + j + "\t");
//			Thread.sleep(1000);
//		}
	}

	@Override
	public void run() { // run() method is the starting point of every thread
		System.out.println("Thread name: " + Thread.currentThread().getName());
//		for (int i = 1; i <= 200; i++) {
//			System.out.print("i: " + i + "\t");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("Child thread exiting...");
//			}
//		}
	}
}
