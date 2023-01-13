package chapter09;

public class Car {

	public int speed;
	public void speedUp() {
		speed += 1;//오버라이드 불가능한메소드
	}
	
	public final void stop() {
		speed += 1;//오버라이드 불가능한메소드
	}
}
