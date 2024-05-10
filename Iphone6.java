package oopExam;

public class Iphone6 extends Iphone5 {
	public void compass() {
		System.out.println("Noth is always on the top of the compass");

	}

	/*
	 * When different methods exist with the same method name but with different
	 * parameters or signature, it is called method overloading. Static Polymorphism
	 * or early binding or method overloading or compile time polymorphism: happens
	 * in compile time. When different methods exist with the same method name with
	 * same parameters or signature but with different syntax or logic, it is called
	 * method overriding. Dynamic Polymorphism or late binding or method overriding
	 * or run time polymorphism: happens in Run time. Static binding in Java occurs
	 * during compile time while dynamic binding occurs during runtime. Overloaded
	 * methods are bonded using static binding at compile time while overridden
	 * methods are bonded using dynamic binding at runtime. Method overloaded is
	 * Final type but Method overriding is not. Method overloaded is Static type but
	 * Method overriding is Not But static method can be implemented in child class
	 * without @Override annotation
	 */

	public int ramPrice;
	public int cameraPrice;
	public String processorPrice;
	public int monitorPrice;

	public void materials() {

	}

	public int materials(int ramPrice) {
		return 0;

	}

	public int materials(int ramPrice, String processorPrice) {
		int total = ramPrice + Integer.parseInt(processorPrice);
		return total;

	}

	public void materials(int ramPrice, int cameraPrice, int monitorPrice) {

	}

	public static int materials(int ramPrice, int monitorPrice) {
		int total2 = ramPrice + monitorPrice;
		return total2;

	}

	public final int materials(int ramPrice, int cameraPrice, int monitorPrice, String processorPrice) {
		int total3 = ramPrice + monitorPrice + cameraPrice + Integer.parseInt(processorPrice);
		return total3;

	}

}
