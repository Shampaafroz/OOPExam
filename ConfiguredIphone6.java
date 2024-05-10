package oopExam;

public class ConfiguredIphone6 extends Iphone6 {
	@Override
	public void materials() {
		System.out.println("This is material from Configured Iphone6");
	}

	@Override
	public int materials(int ramPrice) {
		System.out.println("Ram Price");
		return 0;
	}

	@Override
	public int materials(int ramPrice, String processorPrice) {
		int total = ramPrice + 100 + Integer.parseInt(processorPrice);
		return total;
	}

	@Override
	public void materials(int ramPrice, int cameraPrice, int monitorPrice) {
		System.out
				.println("Ram Price :" + ramPrice + " Camera Price :" + cameraPrice + " Monitor Price :" + cameraPrice);
	}

}
