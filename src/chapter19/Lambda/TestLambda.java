package chapter19.Lambda;

interface PrintString{
	void showString(String str);
}
public class TestLambda {

	public static void main(String[] args) {
		

		//람다식
		PrintString lambdaStr = s -> System.out.println(s);//함수명을 변수명으로 대체
		showMyString(lambdaStr);
		
		
		PrintString reStr = returnString();//returnString()메소드안에있는 람다식 구현부 호출
		reStr.showString("Hello");
	}

	public static void showMyString(PrintString p) { //매개변수구현 => p가body
		p.showString("hello lambda");
	}
	
	public static PrintString returnString() {//반환값으로 body구현
		
		return s -> System.out.println(s + "world");
	}
}
