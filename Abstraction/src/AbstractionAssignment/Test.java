package AbstractionAssignment;

public class Test {

	public static void main(String[] args) {
		TouchScreenLaptop hp = new HPNoteBook();
		hp.click();
		TouchScreenLaptop dell = new DellNoteBook();
		dell.click();
	}

}
