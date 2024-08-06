package tw.howard.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入文字：");
//		String word = scanner.nextLine();
		
		while (scanner.hasNext()) {
			String word = (String) scanner.next();
			StringBuffer reverse = new StringBuffer();
			for (int i = word.length() - 1; i >= 0; i--) {
				reverse.append(word.charAt(i));
			}			
			System.out.print(reverse.toString()+" ");
		}
	
		
		
		
	}

}
