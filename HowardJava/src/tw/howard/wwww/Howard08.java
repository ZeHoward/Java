package tw.howard.wwww;

import java.util.ArrayList;

public class Howard08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[3]; // 第一次給值的動作就是初始化
		boolean[] array2 = new boolean[2]; 
		char[] array3 = new char[2]; 
		float[] array4 = new float[2]; 
		double[] array5 = new double[2]; 
		long[] array6 = new long[2]; 
		short[] array7 = new short[2]; 
		byte[] array8 = new byte[2]; 
		System.out.println(array1[0]);
		System.out.println(array2[1]);
		System.out.println(array3[1]);
		System.out.println(array4[1]);
		System.out.println(array5[1]);
		System.out.println(array6[1]);
		System.out.println(array7[1]);
		System.out.println(array8[1]);
		
		array1[1] = 100;
		array1[2] = 10;
//		array1[33330] = 1;
		
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[0]);
		System.out.println("--------------");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(i);
		}
		System.out.println("--------------");
		for (int x : array1) {
			System.out.println(x);
		}
	}

}
