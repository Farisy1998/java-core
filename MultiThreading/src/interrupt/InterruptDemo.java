package interrupt;

public class InterruptDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();	// We can only interrupt a thread which is in sleep mode
		
		// If any thread is in sleeping or waiting for a state then using the
		// interrupt() method, we can interrupt the execution of that thread by showing 
		// InterruptedException

		System.out.println("End of the main() method");
	}

}
