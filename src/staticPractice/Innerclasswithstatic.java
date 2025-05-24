package staticPractice;

public class Innerclasswithstatic {
	static class a {
		static String outerStaticVar = "sivaji hi";

		static void display() {
			System.out.println("Outer static variable: " + Innerclasswithstatic.a.outerStaticVar);
		}
	}

	class c {
		String outerStaticVar1 = "sivaji hi";

		void display() {
			
			c obj = new c();
			System.out.println("Outer static variable non static: " + obj.outerStaticVar1);
		}
	}

}
