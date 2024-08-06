package tw.howard.wwww;

import tw.howard.apis.Bike;

public class Howard17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String();
		System.out.println(s1.length());
		
		byte[] b1 = { 97, 98, 99, 100 };
		String s2 = new String(b1);
		System.out.println(s2.length());
		System.out.println(s2);
		
		Bike b2 = new Bike();
		System.out.println(b2);
		
		int c = 12;
		System.out.println(c);
		
		Object object1 = new Object();
		System.out.println(object1);
		
		String s3 = "Howard";
		System.out.println(s3);
		String s4 = "Howard";
		String s5 = new String("Howard");
		String s6 = new String("Howard");
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s6 == s5);
		System.out.println("==============");
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s4));
		System.out.println(s5.equals(s6));
		System.out.println(s6.equals(s3));
		
		System.out.println("Howard".charAt(0)); // "" 雙引號本身就是物件
	}

}
