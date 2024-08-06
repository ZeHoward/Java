package tw.howard.practice;

import java.util.Scanner;

public class CheckPhone {

	public static boolean CellPhoneIsRight(String phone) {
//		boolean isRight = false;

		if (phone.matches("[0][9][0-9]{2}-[0-9]{6}")) {
			return true;
		} else {
			System.out.println("輸入錯誤");
		}
		return false;
	}

	public static boolean PhoneIsRight(String phone) {
//		boolean isRight = false;

		if (phone.matches("[0][0-9]-[1-9][0-9]{6,7}")) {
			return true;
		} else {
			System.out.println("輸入錯誤");
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("選擇要輸入手機或市話號碼： ");
		System.out.println("手機輸入1");
		System.out.println("市話輸入2");
		int x = scanner.nextInt();
		scanner.nextLine();

		switch (x) {
		case 1:
			System.out.println("請輸入手機：");
			System.out.println("格式應為 09XX-XXXXXX");
			String cellPhone = scanner.nextLine();
			System.out.println(CellPhoneIsRight(cellPhone));
			break;
		case 2:
			System.out.println("請輸入市話：");
			System.out.println("格式應為 0X-XXXXXXXX");
			String Phone = scanner.nextLine();
			System.out.println(PhoneIsRight(Phone));
			break;

		default:
			System.out.println("請重新輸入！");
			break;
		}

	}
}
