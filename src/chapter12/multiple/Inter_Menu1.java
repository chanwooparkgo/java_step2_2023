package chapter12.multiple;

public interface Inter_Menu1 {

	abstract String jajang();
	String jjambbong();
	
	default void show() {
		System.out.println("맛집~~");
	}
}
