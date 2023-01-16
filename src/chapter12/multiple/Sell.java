package chapter12.multiple;

public interface Sell  {

	void sell();
	//같은 이름의default메소드는 존재할 수 없으므로 오버라이딩 필수!!!
	//최종 오버라이딩 메소드가 출력됨
	
	/*
	default void order() {
		System.out.println("판매주문");
	}
	*/
	default void sellorder() {
		System.out.println("판매주문");
	}
	
}
