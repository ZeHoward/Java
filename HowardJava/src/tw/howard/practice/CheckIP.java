package tw.howard.practice;

import java.util.Scanner;

public class CheckIP {

	public static boolean isRight(String ip) {
//			boolean isRight = false;

		if (ip.matches("[0][9][0-9]{2}-[0-9]{6}")) {
			return true;
		} else {
			System.out.println("輸入錯誤");
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入日期： ");
		System.out.println("格式應為XXXX-XX-XX");
		String date = scanner.nextLine();
		System.out.println(isRight(date));
	}

}
