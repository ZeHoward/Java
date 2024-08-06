package tw.howard.practice;

import java.util.ArrayList;
import java.util.Collections;

public class shuffle {
	public static void main(String[] args) {
		ArrayList<Integer> poker = new ArrayList<>();
		for (int i = 0; i < 52; i++) {
			poker.add(i);
		}

		String[] suits = { "♠", "♥", "♦", "♣" };
		String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		Collections.shuffle(poker);

//		for (Integer card : poker) {
//			System.out.printf("%s%s ", suits[card / 13], values[card % 13]);
//		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.printf("%s%s ", suits[poker.indexOf(i * 13 + j) / 13],
						values[poker.indexOf(i * 13 + j) % 13]);
			}
			System.out.println();
		}
	}
}