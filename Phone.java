package oopExam;

/*
Interface is a reference type in Java, similar to a class, that can contain only constants,default methods, static methods.
Interfaces cannot be instantiated on their own and can be implemented by classes using the 'implements' keyword.
- Interfaces can declare constants, which are implicitly public, static, and final.
- Interfaces can declare method signatures without implementations, which must be implemented by classes that implement the interface.
- Interfaces can contain default methods, which provide a default implementation that can be overridden by implementing classes.
- Interfaces can contain static methods, which are associated with the interface and can be called using the interface name.
- Interfaces can define nested types such as interfaces or classes within them.
*/
public interface Phone extends Pager, Wakitoki {

	public static final int phoneBill = 230;

	// No inheritance of regular classes or abstract classes allowed in interfaces
	// No variables or constructors can be declared directly in an interface

	public void interfaceInfo();

	public abstract void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("battery is a default method from Java.");
	}

	public static void wireless() {
		System.out.println("wireless is a static method from Java.");
	}

}
