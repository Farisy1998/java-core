package synchronization.classlock;

public class SynchronizationDemo {
	public static void main(String[] args) {
		
		MyThread mt1 = new MyThread("Farisy");
		MyThread mt2 = new MyThread("Achu");
		
		mt1.start();
		mt2.start();
		
	}
}
