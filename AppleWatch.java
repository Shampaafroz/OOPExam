package oopExam;

/*
* Abstract Class names starts with UpperCase like a regular class.
* An abstract class is a superclass that cannot be instantiated (can’t create objects)
* Contains both abstract and non abstract methods.
* Abstract method can not be implemented, can be defined (declared) only.
* Non abstract methods can be implemented, but can not be defined (declared).
* An abstract class can inherit only one abstract class or one regular class by extends keyword
* An abstract class can't inherit an Interface by extends keyword.
* An Abstract class can inherit Interface by implements keyword.
* An abstract class cannot inherit a regular class or abstract class by implements keyword.
* Inside Abstract class, variable can be declared or initialized.
* We can Declare a Constructor inside Abstract class.
* Abstract Class cannot be instantiated but by the help of  concrete class, it can be instantiated.
* This is "mandatory to put abstract keyword" with the abstract method inside Abstract Class.
* This is the norm/rules to "write at least one abstract method" inside abstract class.
*/

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public String model;
	public int appleWatch = 6;

	public AppleWatch() {

	}

	public void abstractClassInfo() {

	}

	public abstract void appleWatchInfo();

}
