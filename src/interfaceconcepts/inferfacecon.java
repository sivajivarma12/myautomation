package interfaceconcepts;

public interface inferfacecon {
	int a= 10;
	String tg="sivaji varma";
	
	void display2();
	void display3();
	
	public default void screenSize() {
		//default keyword is used, so that screenSize method can be or can't be implemented in parent method.
		loginApplication();
	}
	
	public static void demi() // introduced in jdk8
	{
		System.out.println("demi");
	}
	
	//concrete methods introduced in jdk9
	private void loginApplication()
	{
		System.out.println("login");
	}
}
