package oopExam;

public class TestPhone {
	public static void main(String[] args) {

		Iphone1 iphone1 = new Iphone1();
		iphone1.setInfo("2000");
		iphone1.setPrice(750);
		iphone1.setUser('F');
		iphone1.setMadeInUSA(false);

		System.out.println("I bought this phone in " + iphone1.getInfo() + "\nThe price was " + iphone1.getPrice() + "$"
				+ "\nUser's Sex: " + iphone1.getUser() + "\nMade in USA is:" + iphone1.getMadeInUSA());

		// AppleWatch appleWatch=new AppleWatch();
		// We cannot instantiate abstract class

		// Phone phone=new Phone();
		// We cannot instantiate Interface

		Iphone2 iphone2 = new Iphone2();

		Iphone6 iphone6 = new Iphone6();
		iphone6.setInfo(null);
		iphone6.setPrice(0);
		iphone6.setMadeInUSA(false);
		iphone6.setUser('F');
		iphone6.getInfo();
		iphone6.getPrice();
		iphone6.getUser();
		iphone6.getMadeInUSA();
		iphone6.regularClassInfo();
		iphone6.youTube();
		iphone6.iphone2Info();
		iphone6.dropBox();
		iphone6.photos();
		iphone6.email();
		iphone6.appleWatchInfo();
		iphone6.abstractClassInfo();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.battery();
		iphone6.materials();
		iphone6.materials(100);
		iphone6.materials(100, "200");
		iphone6.materials(100, 300, 400);
		iphone6.materials(100, 300, 400, "200");

		// Relation between Iphone1 and Iphone2 is example of Single Inheritance
		// Relation between Iphone1, Iphone2, Iphone4,Iphone5 and Iphone6 are the
		// example of Multilevel Inheritance
		// Iphone2 and Iphone3 derived from Iphone1, this is the example of hierarchical
		// inheritance.

		ConfiguredIphone6 conIphone6 = new ConfiguredIphone6();
		conIphone6.setInfo(null);
		conIphone6.setPrice(0);
		conIphone6.setMadeInUSA(false);
		conIphone6.setUser('F');
		conIphone6.getInfo();
		conIphone6.getPrice();
		conIphone6.getUser();
		conIphone6.getMadeInUSA();
		conIphone6.regularClassInfo();
		conIphone6.youTube();
		conIphone6.iphone2Info();
		conIphone6.dropBox();
		conIphone6.photos();
		conIphone6.email();
		conIphone6.appleWatchInfo();
		conIphone6.abstractClassInfo();
		conIphone6.interfaceInfo();
		conIphone6.call();
		conIphone6.message();
		conIphone6.camera();
		conIphone6.battery();
		conIphone6.materials();
		conIphone6.materials(100);
		conIphone6.materials(100, "200");
		conIphone6.materials(100, 300, 400);
		conIphone6.materials(100, 300, 400, "200");

	}

}


