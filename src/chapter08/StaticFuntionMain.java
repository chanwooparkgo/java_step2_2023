package chapter08;

public class StaticFuntionMain {

	public static void main(String[] args) {
		
		StaticFunction sf = new StaticFunction();
		System.out.println("st.str2");
		String s=sf.getStatic();
		System.out.println(s);
		
		//static 메소드는 클래스명으로 접근이 가능
		String str;
		str=StaticFunction.getStatic();
		System.out.println(str);

	}

}