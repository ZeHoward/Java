package tw.howard.wwww;

public class Howard25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Howard251 {
	void m1() {

	}

	void m1(int a) {

	}

	public int m1(double a) {
		return 1;
	}

	void m2() {

	}
}

class Howard252 extends Howard251 {
	@Override
	void m2() {
		// TODO Auto-generated method stub
		super.m2();
//		return 1;
	}
}
