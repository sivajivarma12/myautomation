package abstractconcepts;

public  class AbstractclassImplementation extends abstractclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractclassImplementation ab1  = new AbstractclassImplementation();
		ab1.dispaly1();
		ab1.display2();
	}

	@Override
	void dispaly1() {
		int newvalue = 1234;
		System.out.println(newvalue);
	}

}
