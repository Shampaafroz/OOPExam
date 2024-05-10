package oopExam;

public class Iphone2 extends Iphone1 {
	public char userOfIphone2 = 'M';

	public Iphone2() {
	}

	public Iphone2(char Model) {
		super();
		super.setInfo("Call ");
	}

	public void iphone2Info() {
		super.version = 4.8f;
	}

	public void dropBox() {
		System.out.println("free space limited 2gb");

	}

}
