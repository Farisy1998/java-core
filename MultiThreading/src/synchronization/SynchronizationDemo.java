package synchronization;

public class SynchronizationDemo {
	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		MyThread mt1 = new MyThread(dm, "Farisy");
		MyThread mt2 = new MyThread(dm, "Achu");
		
		mt1.start();
		mt2.start();
		
	}
}
