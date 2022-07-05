package usecase;

public abstract class DELL implements TouchScreenLaptop {
	@Override
	public void scroll() {
		System.out.println("DELL: Scrolling...");
	}
}
