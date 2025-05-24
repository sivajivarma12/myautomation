package interfaceconcepts;

public class interfaceImplementation implements inferfacecon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       interfaceImplementation ab = new interfaceImplementation();
       ab.display2();
       ab.display3();
       ab.screenSize();
       inferfacecon.demi();
	}

/*	@Override
	public void screenSize(){
		System.out.println("screen size");
	}*/
	
	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("display2");
	}

	@Override
	public void display3() {
		// TODO Auto-generated method stub
		System.out.println("display3");
	}

	
}
