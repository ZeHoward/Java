package tw.howard.wwww;

import java.io.File;

public class Howard33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("d:\\dir2");
		File f2 = new File("d:/test1");  // 因Java有跨平台所以可以用 "/"
		
		if (f1.exists()) {
			System.out.println("ok");
		} else {
			System.out.println("x");
			if (f1.mkdir()) {
				System.out.println("ok");
			} else {
				System.out.println("xx");
			}
		}
		
		File nowDir = new File(".");
		System.out.println(nowDir.getAbsolutePath());
	}
}
