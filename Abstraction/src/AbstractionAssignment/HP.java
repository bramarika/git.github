package AbstractionAssignment;

public abstract class HP implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("Inside hp scroll");
	}

	@Override
	public abstract void click();

}
