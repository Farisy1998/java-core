package customexceptions;

public class Test {
	public static void main(String[] args) throws CheckedCustomException {
		//throw new UncheckedCustomException("Unchecked Custom Exception occured");
		throw new CheckedCustomException("Checked Custom Exception occured and needs to be handled");
	}
}
