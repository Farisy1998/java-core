
public class LabelledBlock {

	public static void main(String[] args) {
		int x = 20;
		
		// Labeled block
		l1:{
			System.out.println("block begins");
			if(x==20) {
				break l1;
			}
			System.out.println("block ends");
		}
		System.out.println("outside the l1 block");
	}

}
