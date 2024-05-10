package oopExam;

/*
 * Regular Class is a blueprint from which individual objects are created.
 * Inside a regular class, variable can be declared or initialized.
 * Method only implemented inside regular class, but not declared or defined.
 * Contains only non abstract methods or implemented method, doesn't contain abstract methods.
 * Default methods are Not allowed in regular class.
 * Implements and extends keyword is used for inheritance.
 * A regular class can inherit only one (regular class or one abstract class) by extends keyword.
 * A regular class can't inherit an Interface by extends keyword.
 * A Regular class can inherit Interface by Implement keyword.
 * A regular class can inherit more than one Interface.
 * A regular class cannot inherit a regular class or abstract class by implements keyword.
 */

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;
	public float version;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean getMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	
	public Iphone1() {
	}


	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
	}

	
	public void regularClassInfo() {
		// Features of a Regular Class
		System.out.println("Regular class have fields, methods, constructors");
		System.out.println("Regular class implement interfaces");
		System.out.println("Regular class can extend only one class");
		System.out.println("Regular class have abstract methods if declared abstract");
		System.out.println("Regular class have final methods or fields");
		System.out.println("Regular class have access modifiers like public, private, protected, or default");
		System.out.println(
				"Regular class cannot be instantiated if it has abstract methods (unless subclass implements them)");
		System.out.println("Regular class Cannot be extended by multiple classes (no multiple inheritance)");

		// Features of an Interface:
		System.out.println("Interface can only contain abstract methods and constants (static final fields)");
		System.out.println(
				"Interface cannot have method bodies until Java 8 (default and static methods are allowed since Java 8)");
		System.out.println("Interface can extend multiple interfaces");
		System.out.println("Interface can be implemented by classes or other interfaces");
		System.out.println("Interface cannot be instantiated directly");
		System.out.println("Interface's all methods are implicitly public and abstract");

		// Features of an Abstract Class:
		System.out
				.println("Abstract can have abstract methods (methods without body) and concrete methods (with body)");
		System.out.println("Abstract can have constructors");
		System.out.println("Abstract cannot be instantiated (can have constructors for subclasses)");
		System.out.println("Abstract can extend only one class or abstract class (but implement multiple interfaces)");
		System.out.println("Abstract can have fields, constants, and static methods");
		System.out.println("Abstract can provide partial implementation of interface methods");
		System.out.println("Abstract can have access modifiers like public, private, protected, or default");

	}

	// Method to play a video
	public void youTube() {
		System.out.println("Playing video...");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showTime() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub
		
	}

}
