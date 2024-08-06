package tw.howard.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class findBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("想要輸入幾個數字");
		int x = scanner.nextInt();
//		int[] nums = new int[x];
		System.out.println("================");

		ArrayList<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < x; i++) {
			int o = scanner.nextInt();
			nums.add(o);
		}
		Collections.sort(nums);

//		System.out.println(nums);
		System.out.println("最大的數字是: " + nums.get(nums.size() - 1));
	}
}
