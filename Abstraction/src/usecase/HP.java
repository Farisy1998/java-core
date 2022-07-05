package usecase;

public abstract class HP implements TouchScreenLaptop {
	@Override
	public void scroll() {
		System.out.println("HP: Scrolling...");
	}
}
