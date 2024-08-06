package tw.howard.wwww;

import java.util.LinkedList;
import java.util.List;

public class Howard30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new LinkedList();
		list.add("Howard");
		list.add(123);
		list.add(true);
		list.add(12.33);
		list.add(true);
		list.add(12.34);

		list.add(list.remove(3));
		
		System.out.println(list.size());
		for (Object x : list) {
			System.out.println(x);
		}
	}

}
