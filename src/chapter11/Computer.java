package chapter11;
//단 하나라도 추상메소드가 존재하면 반드시 abstract를 추가한다
//추상클래스
public abstract class Computer {

	//추상메소드 | Body가 없다
	
	public abstract void display(); //하위클래스 구현해서 사용하라는 의미
	public abstract void typing();
	
	//일반메소드
	public void turnOn() {
		System.out.println("전원을켭니다");
		
	}
	
	public void turnOff() {
		System.out.println("전원을끕니다");
		
	}
}
