package tw.howard.wwww;

import java.util.HashSet;

import tw.howard.apis.Bike;

public class Howard27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		
		set.add("Howard");
		set.add(12); // 12 => new Integer(12) auto-boxing
		set.add(12.3);
		set.add(new Bike());
		set.add(12);
		System.out.println(set.size());
		System.out.println(set);
	}

}
