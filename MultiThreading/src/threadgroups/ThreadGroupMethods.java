package threadgroups;

public class ThreadGroupMethods {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup mtg = new ThreadGroup("My Thread Group");
		CustomThread ct1 = new CustomThread(mtg, "Thread-1");
		CustomThread ct2 = new CustomThread(mtg, "Thread-2");
		CustomThread ct3 = new CustomThread(mtg, "Thread-3");
		ct1.start();
		ct2.start();
		ct3.start();
		System.out.println(mtg.activeCount()); // gives the no: of threads that are
												// active in this mtg thread group
		mtg.list();
		Thread.sleep(5000);
		System.out.println(mtg.activeCount());
		mtg.list();
	}

}
