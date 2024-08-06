package tw.howard.wwww;

import java.util.Iterator;

public class Howard09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0;
		for (int i = 0; i < 100; i++) {
			int x = (int) (Math.random() * 6) + 1;
			if (x == 1) {
				p1++;
			} else if (x == 2) {
				p2++;
			} else if (x == 3) {
				p3++;
			} else if (x == 4) {
				p4++;
			} else if (x == 5) {
				p5++;
			} else {
				p6++;
			}
		}
		System.out.println("數字1骰出："+p1+"次");
		System.out.println("數字2骰出："+p2+"次");
		System.out.println("數字3骰出："+p3+"次");
		System.out.println("數字4骰出："+p4+"次");
		System.out.println("數字5骰出："+p5+"次");
		System.out.println("數字6骰出："+p6+"次");
	}

}
