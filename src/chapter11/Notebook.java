package chapter11;

public class Notebook extends Computer {
//상속받은 두개의 추상메소드중 하나만 정의해서 사용할 경우 추상클래스로 구현됨
	@Override
	public void display() {
		System.out.println("desktop display");
		
	}

	@Override
	public void typing() {
		System.out.println("desktop typing");
		
	}

}
