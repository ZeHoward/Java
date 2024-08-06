package tw.howard.wwww;

import tw.howard.apis.Scooter;

public class Howard14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scooter s1 = new Scooter();   // 呼叫該類別的建構式
		s1.changeGear(1);
		s1.upSpeed();
		s1.upSpeed();
		s1.upSpeed();
		System.out.println(s1.getSpeed());
		System.out.println(s1.getColor());
	}

}
