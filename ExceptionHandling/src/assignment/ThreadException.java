package assignment;

public class ThreadException {

	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			throw new MyThreadException("Handled InterruptedException and throwed a MyThreadException");
			// System.out.println("InterruptedException occured");
		}
	}

}
