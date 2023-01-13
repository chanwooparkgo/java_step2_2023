package chapter09;

public class B {

	
	//같은 패키지에서의 public증명
	public void method() {
		A a= new A();
		a.field="Value";
		a.method();
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.method();
		

	}

}
