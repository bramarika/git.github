package AbstractionAssignment;

public abstract class Dell implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("Inside dell scroll");
	}

	@Override
	public abstract void click();

}
