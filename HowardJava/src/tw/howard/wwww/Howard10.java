package tw.howard.wwww;

import java.util.Iterator;

public class Howard10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = new int[7];
		for (int i = 0; i < 10000; i++) {
			int x = (int) (Math.random() * 6) + 1;
			if (x >= 1 && x <= 6) {
				p[x]++;
			}
		}

		if (p[0] > 0) {
			System.out.println("Error");
		} else {
			for (int i = 1; i < p.length; i++) {
				System.out.printf("數字%d骰出：%d次\n", i, p[i]);
			}
		}
	}
}
