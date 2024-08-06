package tw.howard.wwww;

import java.util.LinkedHashSet;

public class Howard29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("Howard");
		names.add("John");
		names.add("Mary");
		names.add("Tony");
		names.add("Mike");
		names.add("John"); // 不會重複 System.out.println(names.add("John")); 顯示false
		names.add("Joe");
		names.add("John");
		System.out.println("============");
		for (String x : names) {
			System.out.println(x);
		}
	}

}
