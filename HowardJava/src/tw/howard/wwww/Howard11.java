package tw.howard.wwww;

public class Howard11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];

		for (int[] x : a) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}

}
