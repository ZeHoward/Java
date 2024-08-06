package tw.howard.wwww;

import java.util.Scanner;

public class Howard07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("請輸入這是幾到幾的九九乘法表");
//		System.out.print("數字1：");
//		int a = scanner.nextInt();
//		System.out.print("數字2：");
//		int b = scanner.nextInt();
//
//		for (int j = 1; j <= 9; j++) {
//			for (int i = a; i <= b; i++) {
//				System.out.printf("%d × %d = %d\t", i, j, i * j);
//			}
//			System.out.println();
//		}
		final int ROWS = 2;
		final int COLS = 4;
		final int START = 1;

		for (int k = 0; k < ROWS; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = START; i < START + COLS; i++) {
					int newi = i + k * COLS;
					int r = newi * j;
					System.out.printf("%d × %d = %d\t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println("--------");
		}
	}

}
