package chapter09;

public class ChildMain {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();//parent
		child.method2();//오버라이드 우선권, child(자식)=내것
		child.method3();//내것
		
		System.out.println();
		Parent parent = new Parent();
		parent.method1();
		parent.method2();
		//오버라이드  우선
		//독립적으로 부모클래스만 사용
		System.out.println();
		Parent parent2=child;
		parent2.method1();
		parent2.method2();

	}

}
