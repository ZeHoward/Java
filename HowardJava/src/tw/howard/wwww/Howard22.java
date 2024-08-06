package tw.howard.wwww;

public class Howard22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Howard221 obj1 = new Howard221() {
			@Override
			void m2() {
				// TODO Auto-generated method stub
				System.out.println("Howard221:m2()");
			}
		};
		obj1.m1();
		obj1.m2();

		Howard221 obj2 = new Howard222();
		obj2.m1();
		obj2.m2();
	}

}

abstract class Howard221 {
	void m1() {
		System.out.println("Howard221:m1()");
	}

	abstract void m2();
}

class Howard222 extends Howard221 {
	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("Howard222:m1()");
	}
}

class Howard223 extends Howard221 {

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("Howard223:m1()");
	}

}