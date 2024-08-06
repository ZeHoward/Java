package tw.howard.practice;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		for (i = 1; i <= 100; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (j >= i) {
				System.out.println(j);
			}
		}
	}
}
