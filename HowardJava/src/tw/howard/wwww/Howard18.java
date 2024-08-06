package tw.howard.wwww;

import java.util.Random;
import java.util.Scanner;

import tw.howard.apis.TWID;

public class Howard18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("輸入身分證字號：");
		String id = scanner.nextLine();

		System.out.println(TWID.isRight(id));

//		Random rand = new Random();
//		int dice = rand.nextInt(1, 7);
//		System.out.println(dice);

//		TWID id1 = new TWID();
//		TWID id2 = new TWID(false);
//		TWID id3 = new TWID('B');
//		TWID id4 = new TWID(true, 'Y');
//		TWID id5 = TWID.newTWID("B122603829");
//		
//		System.out.println(id1.getID());
//		System.out.println(id2.getID());
//		System.out.println(id3.getID());
//		System.out.println(id4.getID());
//		System.out.println(id5.getID());
		
	}

}
