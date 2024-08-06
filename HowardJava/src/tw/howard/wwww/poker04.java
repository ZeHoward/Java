package tw.howard.wwww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class poker04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> poker = new ArrayList<Integer>();
		for (int i = 0; i < 52; i++) {
			poker.add(i);
		}
		Collections.shuffle(poker);
	}

}
