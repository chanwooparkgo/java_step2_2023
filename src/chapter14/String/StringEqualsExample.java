package chapter14.String;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = new String("홍길동");
		String strVal2 = "홍길동";
		
		if(strVal1 ==strVal2) {//외부(메모리가같은지비교)
			System.out.println("같은String 객체");
		}else {
			System.out.println("다른 String객체를 참조");
		}
		
		if(strVal1.equals(strVal2)) {//내부 ;객체관련해서물어보는문
			System.out.println("같은문자열을가짐");
		}else {
			System.out.println("다른문자열을가짐");
		}

	}

}
