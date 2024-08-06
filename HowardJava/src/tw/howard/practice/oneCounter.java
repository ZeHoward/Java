package tw.howard.practice;

import java.util.Scanner;

public class oneCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入數字：");
		String nums = scanner.nextLine();
		
		try {
			int numsInt = Integer.parseInt(nums);
			if (numsInt / 1 != numsInt) {
				System.out.println("請輸入數字！");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

//		for (int i = 0; i < nums.length(); i++) {
//
//		}
	}

}
