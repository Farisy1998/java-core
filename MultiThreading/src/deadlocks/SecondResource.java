package deadlocks;

public class SecondResource {
	public synchronized void method1(FirstResource fr) {
		System.out.println("Inside method1() of sr");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method2() of fr");
		fr.method2();
	}
	public synchronized void method2() {
		System.out.println("Inside method2() of sr");
	}
}
