package tw.howard.practice;

import java.util.Iterator;
import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int temp = 1;
		System.out.println("輸入要計算多少!");
		int x = scan.nextInt();
		for (int i = 1; i <= x; i++) {
			temp *= i;
		}
		System.out.println(temp);
	}

}
