package tw.howard.practice;

import java.util.Scanner;
import tw.howard.apis.Date;

public class CheckDate {

	public static boolean isRight(String date) {
		boolean isRight = false;

		if (date.matches("[12][0-9]{3}[-][01][0-9][-][0-3][0-9]")) {
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
