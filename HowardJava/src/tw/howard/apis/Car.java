package tw.howard.apis;

public class Car extends Scooter{ // 只會傳父類別無參數的建構式來用
	public Car(int a) {
		// super(); 沒打第一行隱含一行
		super("");
		System.out.println("Car(int)");
	}

}
