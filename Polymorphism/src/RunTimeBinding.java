
public class RunTimeBinding {
	public static void main(String[] args) {
		AppleLaptop m1 = new MacbookPro(); // up-casting MacbokPro's object to AppleLaptop's object
		AppleLaptop m2 = new MacbookAir(); // up-casting MacbokAir's object to AppleLaptop's object
		m1.start();
		m1.shutdown();

		MacbookPro m3 = (MacbookPro) m1; // down-casting AppleLaptop's object to MacbookPro's object
		m3.prosmethod();
		
		m2.start();
		m2.shutdown();

		MacbookAir m4 = (MacbookAir) m2; // down-casting AppleLaptop's object to MacbookAir's object
	}
}
