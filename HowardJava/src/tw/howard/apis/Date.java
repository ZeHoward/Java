package tw.howard.apis;

import java.util.Scanner;

public class Date {
	
	public Date() {
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
	}

	public static boolean isRight(String date) {
		boolean isRight = false;

		if (date.matches("[12][0-9]{3}[-][01][0-9][-][0-3][0-9]")) {
			isRight = true;
		}else {
			System.out.println("輸入錯誤");
		}

		return isRight;
	}
}
