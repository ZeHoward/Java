package tw.howard.apis;

public class Bike extends Object { // 最父層為Object
	protected double speed;

	/*
	 * 1.所有類別一定有建構式 2.建構式 1.祖宗全部全部完成初始化 2.才開始自己初始化
	 */

	public Bike() { // 在java裡所有class裡面一定會有建構式
		System.out.println("Bike()");
	}

	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.2;
	}

	public void downSpeed() {
		speed = speed > 1 ? 0 : speed * 0.8;
	}

	public double getSpeed() {
		return speed;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'm a bike." + speed;
	}
}
