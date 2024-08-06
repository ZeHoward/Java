package tw.howard.wwww;

public class Howard20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Howard201 obj1 = new Howard201();
		obj1.m1();
		obj1.m2();
		Howard202 obj2 = new Howard202();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		Howard201 obj3 = new Howard202();
		obj3.m1();
		obj3.m2();
		Howard202 obj4 = (Howard202) obj3;
		obj4.m1();
		obj4.m2();
		obj4.m3();

//		Howard202 obj5 = new Howard203(); // 無關係，不能這樣用
//		Howard203 obj6 = new Howard202();

		Howard201 obj7 = new Howard202();
//		Howard203 obj8 = (Howard203) obj7;

		if (obj7 instanceof Object) {
			System.out.println("Yes1");
		} else {
			System.out.println("No1");
		}
		if (obj7 instanceof Howard201) {
			System.out.println("Yes2");
		} else {
			System.out.println("No2");
		}
		if (obj7 instanceof Howard202) {
			System.out.println("Yes3");
		} else {
			System.out.println("No3");
		}
		if (obj7 instanceof Howard203) {
			System.out.println("Yes4");
		} else {
			System.out.println("No4");
		}
		if (obj7 instanceof Howard203) {
			System.out.println("Yes4");
		} else {
			System.out.println("No4");
		}
//		if (obj7 instanceof String) {
//			System.out.println("Yes4");
//		} else {
//			System.out.println("No4");
//		}

	}
}

class Howard201 {
	void m1() {
		System.out.println("Howard201:m1()");
	}

	void m2() {
		System.out.println("Howard201:m2()");
	}

}

class Howard202 extends Howard201 {
	void m2() {
		System.out.println("Howard202:m2()");
	}

	void m3() {
		System.out.println("Howard202:m3()");
	}
}

class Howard203 extends Howard201 {
	void m2() {
		System.out.println("Howard203:m2()");
	}

	void m3() {
		System.out.println("Howard203:m3()");
	}
}
