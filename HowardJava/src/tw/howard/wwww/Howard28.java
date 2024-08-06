package tw.howard.wwww;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Howard28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<Integer> set = new HashSet<Integer>();
//		set.add(12);
//		set.add(127);
//		set.add((byte)12); // byte12 => int 12 => Integer(12);

		TreeSet<Integer> power = new TreeSet<Integer>();
		while (power.size() < 6) {
			power.add(new Random().nextInt(1, 39));
		}

		System.out.println(power);
		System.out.println("===========");
		Iterator<Integer> it = power.iterator();
		while (it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
		System.out.println("===========");

		for (Integer x : power) {
			System.out.println(x);
		}
	}

}
