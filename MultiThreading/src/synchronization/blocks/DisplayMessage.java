package synchronization.blocks;

public class DisplayMessage {
	public void sayHello(String name) {
		
		// Any code can goes here.....
		// .......................
		// ..............
		System.out.println("Outside the synchronized block");
		
		synchronized(this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("How are you " + name + "!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
