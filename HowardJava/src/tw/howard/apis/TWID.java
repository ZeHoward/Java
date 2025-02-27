package tw.howard.apis;

import java.util.Random;

import tw.howard.practice.prime;

public class TWID {
	private String id;
	static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO"; // 加static會變成該類別共同擁有

	public TWID() {
		// super(); this(); // 第一行 this(); 還可以呼叫本類別的建構式
		this(new Random().nextInt(2) == 0);
	}

	public TWID(boolean isMale) {
		this(isMale, letters.charAt(new Random().nextInt(26)));
	}

	public TWID(char area) {
		this(new Random().nextInt(2) == 0, area);
	}

	public TWID(boolean isMale, char area) {
		String c1 = new String(new char[] { area });
		StringBuffer sb = new StringBuffer(c1);
		sb.append(isMale ? "1" : "2");
		for (int i = 0; i < 7; i++) {
			sb.append(new Random().nextInt(10));
		}
		for (int i = 0; i < 10; i++) {
			if (isRight(sb.toString() + i)) {
				id = sb.toString() + i;
			}
			break;
		}
	}

	public String getID() {
		return id;
	}

	public boolean isMale() {
		return true;
	}

	public static TWID newTWID(String id) {
		if (isRight(id)) {
			return new TWID();
		} else {
			return null;
		}
	}

//	public TWID(String id) {
//		this.id = id;
//	}

	public static boolean isRight(String id) { // static方法可以放在任何class內，是獨立的方法
		boolean isRight = false;

		if (id.matches("[A-Z][12][0-9]{8}")) { // 正規表示法(Regex)
			char c1 = id.charAt(0);
			int a12 = letters.indexOf(c1) + 10; // 轉換數值A=10, B=11
			int a1 = a12 / 10;
			int a2 = a12 % 10;

//		if (id.length() == 10) {
//			if (id.charAt(0) >= 65 && id.charAt(0) <= 90) {
//				// if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(id.charAt(0)) != -1)
//				if (id.charAt(1) == '1' || id.charAt(1) == '2') {
//					
//				}
//			}
//		}

			String s1 = id.substring(1, 2);
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(id.substring(2, 3));
			int n3 = Integer.parseInt(id.substring(3, 4));
			int n4 = Integer.parseInt(id.substring(4, 5));
			int n5 = Integer.parseInt(id.substring(5, 6));
			int n6 = Integer.parseInt(id.substring(6, 7));
			int n7 = Integer.parseInt(id.substring(7, 8));
			int n8 = Integer.parseInt(id.substring(8, 9));
			int n9 = Integer.parseInt(id.substring(9, 10));

			int sum = a1 * 1 + a2 * 9 + n1 * 8 + n2 * 7 + n3 * 6 + n4 * 5 + n5 * 4 + n6 * 3 + n7 * 2 + n8 * 1 + n9 * 1;

			isRight = sum % 10 == 0;
			return true;
		}

		return isRight;
	}
}
