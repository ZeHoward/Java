package tw.howard.wwww;

public class Howard23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Howard231 obj1 = new Howard232();
		Howard233 obj2 = new Howard232();
		Howard232 obj3 = new Howard232();
		obj1.m1();
		obj2.m3();
		obj3.m4();
	}

}

interface Howard231 {
	void m1();

	void m2();
}

interface Howard233 {
	void m3();

	void m4();
}

class Howard232 implements Howard231, Howard233 {
	public void m1() {

	}

	public void m2() {

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub

	}
}