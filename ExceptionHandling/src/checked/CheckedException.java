package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	void fileRead() throws FileNotFoundException {
		// Demonstration of checked exceptions
		FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args) throws FileNotFoundException {
		CheckedException ce = new CheckedException();
		ce.fileRead();
	}

}
