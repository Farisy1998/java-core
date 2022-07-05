package usecase;

public class Test {
	public static void main(String[] args) {
		HPNotebook hpNotebook = new HPNotebook();
		hpNotebook.scroll();
		hpNotebook.click();
		DELLNotebook dellNotebook = new DELLNotebook();
		dellNotebook.scroll();
		dellNotebook.click();
	}
}
