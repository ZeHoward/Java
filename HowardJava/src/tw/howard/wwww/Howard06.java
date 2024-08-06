package tw.howard.wwww;

import java.util.Iterator;

public class Howard06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for (printHoward(); i < 10; printLine()) {
			System.out.println(i++);
		}
	}

	static void printHoward() {
		System.out.println("Howard");
		System.out.println("-------");
	}

	static void printLine() {
		System.out.println("-------");
	}
}
