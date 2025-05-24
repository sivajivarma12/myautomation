package staticPractice;

public class staticvariablesMethods {

	static String url = "sivaji.com";
	static int a,b;

	public static String returnValue() {
		int a = 10;
		return url;
	}
	public static String returnValue1() {
	
		return url;
	}

	static {
		System.out.println("i am static block");
		a=100;
		b=2000;
	}
	
	static String ab = returnValue1();
	
}
