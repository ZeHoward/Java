package tw.howard.wwww;

public class Howard21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Howard211 obj1 = new Howard211();
		Howard212 obj2 = new Howard212();
		Howard213 obj3 = new Howard213();
		att(obj1);
		att(obj2);
		att(obj3);
	}

	static void att(Howard211 obj) {
		obj.m1();
	}

}

class Howard211 {
	void m1() {
		System.out.println("Howard211:m1()");
	}
}

class Howard212 extends Howard211 {
	void m1() {
		System.out.println("Howard212:m1()");
	}
}

class Howard213 extends Howard211 {
	void m1() {
		System.out.println("Howard213:m1()");
	}
}