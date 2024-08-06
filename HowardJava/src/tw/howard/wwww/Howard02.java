package tw.howard.wwww;

import java.util.Scanner;

public class Howard02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入x：");
		int a = scanner.nextInt();
		System.out.print("請輸入y：");
		int b = scanner.nextInt();
		//System.out.println("x + y = " + (a + b));
		System.out.printf("%d + %d = %d\n", a, b, (a + b));
		System.out.printf("%d - %d = %d\n", a, b, (a - b));
		System.out.printf("%d * %d = %d\n", a, b, (a * b));
		System.out.printf("%d / %d = %d...%d\n", a, b, (a / b), a % b);
	}

}
