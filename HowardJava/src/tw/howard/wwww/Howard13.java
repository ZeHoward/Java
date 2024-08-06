package tw.howard.wwww;

import tw.howard.apis.Bike;

public class Howard13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike myBike = new Bike();
		Bike urBike = new Bike();
		System.out.println(myBike.getSpeed());
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.downSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		System.out.println(myBike.getSpeed());
	}
}
