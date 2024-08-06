package tw.howard.wwww;

public class Howard19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Howard193 obj = new Howard193();
	}

}

class Howard191 {
	Howard191() {
		System.out.println("Howard191()");
	}

}

class Howard192 extends Howard191 {
	Howard192() {
		System.out.println("Howard192()");
	}
}

class Howard193 extends Howard192 {
	Howard193() {
		this(2);
		System.out.println("Howard193()");
	}
	Howard193(int a) {
		this(" ");
		System.out.println("Howard193(int)");
	}
	Howard193(String a) {
		// this();
		System.out.println("Howard193(String)");
	}
}