
public class MacbookPro extends Macbook {
	@Override
	public
	void start() {
		System.out.println("Inside MacbookPro's start()");
	}

	@Override
	public
	void shutdown() {
		System.out.println("Inside MacbookPro's shutdown()");
	}
	
	public void prosmethod() {
		System.out.println("Inside MacbookPro's prosmethod()");
	}
}
