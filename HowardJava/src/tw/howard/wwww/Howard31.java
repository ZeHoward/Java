package tw.howard.wwww;

import java.util.LinkedList;
import java.util.List;

public class Howard31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> time = new LinkedList<String>();
		time.add(0, "10:20:30");
		time.add(0, "10:20:36");
		time.add(0, "10:20:48");
		time.add(0, "10:20:55");
		time.add(0, "10:20:66");
		time.add(0, "10:20:69");

		for (String string : time) {
			System.out.println(string);
		}
	}

}
