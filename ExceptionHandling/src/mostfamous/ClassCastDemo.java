package mostfamous;

public class ClassCastDemo {

	public static void main(String[] args) {
		Object obj = new Object();
		// use the below if loop remove ClassCastException
		//
//		if(obj instanceof String) {
//			String str = (String) obj;
//		}
		String str = (String) obj;	// ClassCastException will raise
	}
 
}
