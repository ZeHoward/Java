package tw.howard.wwww;

import java.util.Scanner;

public class Howard05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入年份：");
		// int year = scanner.nextInt();
		int year = 2001;

		long startTime = System.nanoTime();
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("是閏年");
		} else if (year % 400 == 0) {
			System.out.println("是閏年");
		} else {
			System.out.println("是平年");
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;

		System.out.println("doSomething()花了：" + duration);
	}

}
