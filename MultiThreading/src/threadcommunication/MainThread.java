package threadcommunication;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t = new MyThread();
		// Both the Main thread and Child thread uses the 't' object of MyThread class
		
		t.start();
		System.out.println("Main thread is going to aquire the sync lock");
		synchronized (t) {
			System.out.println("Main thread aquired the sync lock");
			System.out.println("Main thread is going to wait");
			// before child thread execution the value of total is 0
			System.out.println(t.total);
			t.wait();	// Main thread will goes to the wait state and child thread 
						// will start execution
			System.out.println("Main thread get notified");
			// after child thread execution the value of total is 55
			System.out.println(t.total);
		}
	}
}
