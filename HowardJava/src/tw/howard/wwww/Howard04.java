package tw.howard.wwww;

import java.util.Scanner;

public class Howard04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("請輸入成績：");
//		int s = scanner.nextInt();
		double ss = Math.random() * 101;
		int sss = (int) ss;
		System.out.println(sss);

		if (sss >= 90) {
			System.out.println("A");
		} else {
			if (sss >= 80) {
				System.out.println("B");
			} else {
				if (sss >= 70) {
					System.out.println("C");
				} else {
					if (sss >= 60) {
						System.out.println("D");
					} else {
						System.out.println("E");
					}
				}
			}
		}
	}

}
