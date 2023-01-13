package chapter11;

public class SuperLevel extends PlayLevel {

	@Override
	public void run() {
		System.out.println("높이 점프를 합니다");
		
	}

	@Override
	public void jump() {
		System.out.println("아주높이점프를합니다");
		
	}

	@Override
	public void turn() {
		System.out.println("아주높이 돕니다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***고급자*****");
		
	}

}
