package tw.howard.wwww;

public class poker02 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		// 洗牌
		int[] poker = new int[52];
		boolean isRepeat;
		int temp;
		for (int i = 0; i < poker.length; i++) {
			do {
				temp = (int) (Math.random() * 52) + 1;
				// 檢查機制
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) { // 重複了
						isRepeat = true;
						break;
					}
				}
			} while (isRepeat);

			poker[i] = temp;
			System.out.print(poker[i] + " ");

		}

		System.out.println();
		System.out.println("-----------------");
		System.out.println(System.currentTimeMillis() - start);

		// 發牌
		
		

		// 攤牌 + 理牌
	}

}
