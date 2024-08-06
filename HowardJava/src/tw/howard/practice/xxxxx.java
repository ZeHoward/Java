package tw.howard.practice;

import java.util.ArrayList;
import java.util.Collections;

public class xxxxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] poker = new int[4][13];
		int temp = 0;

		for (int i = 0; i < poker.length; i++) {
			for (int j = 0; j < poker[i].length; j++) {
				temp++;
				poker[i][j] = temp;
			}
		}
		for (int[] x : poker) {
			for (int y : x) {
				System.out.printf("%d ", y);
			}
			System.out.println();
		}
		
		System.out.println("======================");

		ArrayList<Integer> ooo = new ArrayList<Integer>();
		for (int i = 0; i < 52; i++) {
			ooo.add(i);
		}
		Collections.shuffle(ooo);
		System.out.print(ooo);
	}

}
