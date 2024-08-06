package tw.howard.apis;

public class Scooter extends Bike {
	private int gear;
	private String color;

	public Scooter() { // 建構式，名稱跟class一樣，使其物件初始化
		// super();
		color = "Yellow";
		System.out.println("Scooter()");
	}

	public Scooter(String color) {
		// super();
		this.color = color;
		System.out.println("Scooter(String)");
	}

	public void changeGear(int gear) {
		if (gear >= 0 && gear <= 4) {
			this.gear = gear;
		}
	}

	public void upSpeed() {
		super.upSpeed();
		if (gear > 0) {
			speed = speed < 1 ? 1 : speed * 1.5 * gear;
		}
	}

	public String getColor() {
		return color;
	}
}
