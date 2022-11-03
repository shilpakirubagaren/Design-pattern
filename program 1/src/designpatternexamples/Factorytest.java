package designpatternexamples;



public class Factorytest {

	public static void main(String[] args) {
		MobileFactory factory=new MobileFactory();
		Lenovo len = (Lenovo)factory.creationmobile("len");
	len.batterypower();
	Samsung sam=(Samsung)factory.creationmobile("sam");
	sam.cost();

	}

}

