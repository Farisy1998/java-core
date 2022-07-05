package daemon;

public class DaemonDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		MyThread thread = new MyThread();
		// thread.setDaemon(true);	// when we declare a child thread or a thread as daemon, 
								// the parent thread or the main thread will stop the 
								// child daemon being executed
		System.out.println(thread.isDaemon());
		thread.start();
	}
}
