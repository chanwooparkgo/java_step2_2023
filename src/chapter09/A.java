package chapter09;

public class A {
	//같은 패키지에서는 protected라 해도 public역활
	//다른 패키지에서는 private역활
	protected String field;//public이지만 상속전용
	
	
	//생성자
	
	
	protected void  method() {
		System.out.println("A class");
		System.out.println("field");
	}
	
}
