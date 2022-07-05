
public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstName("Salmanul");
		c.setLastName("Farisy K");
		c.setCreditCard("12345");
		
		System.out.println(c.getFirstName());
		System.out.println(c.getLastName());
		System.out.println(c.getCreditCard());
	}

}
