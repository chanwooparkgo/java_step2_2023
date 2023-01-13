package chapter09;

public class Child extends Parent{

	@Override
	public void method2() {//매개변수동일, 상속 전제조건
		System.out.println("child-method2()");///
	}

	public void method3() {//매개변수동일, 상속 전제조건
		System.out.println("child-method3()");///
	}
	
}
