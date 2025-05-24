package staticPractice;

public class staticmainclass {

	public static void main(String[] args) {
		
		System.out.println(staticvariablesMethods.returnValue()+" "+staticvariablesMethods.url);
		System.out.println(staticvariablesMethods.a+" "+staticvariablesMethods.b);
		System.out.println(staticvariablesMethods.ab);
		
		Innerclasswithstatic.a.display();
		
		Innerclasswithstatic obj43 = new Innerclasswithstatic();
		Innerclasswithstatic.c obj75= obj43.new c();
		
		System.out.println(obj75.outerStaticVar1);
		obj75.display();
		
	}
	static
	{
		System.out.println("main static block");
	}
	

}
