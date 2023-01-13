package chapter11;

public class AdvancedLevel2 extends PlayLevel {

	@Override
	public void run() {
		System.out.println("빨리달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println("높이점프를 합니다");
		
	}

	@Override
	public void turn() {
		System.out.println("턴은 불가능");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*******중급자입니다*****");
		
	}

}
