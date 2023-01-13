package chapter11;

public class SmartPhone extends Phone {

	//부모 클래스의 생성자를 오버로딩시 기본 생성자를 인식하지 못하므로 추상클래스로 정의한다(추상클래스는 추상생성자생성불가)
	public SmartPhone(String owner) {
		super(owner);
	}
}
