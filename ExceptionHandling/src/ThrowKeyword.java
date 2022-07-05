import java.io.FileNotFoundException;

public class ThrowKeyword {

	public static void main(String[] args) {
		try {
			throw new FileNotFoundException("File not found");
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}
	}

}
