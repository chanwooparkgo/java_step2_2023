package chapter19.Lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1 ="Hello";
		String s2 ="World";
		
		//인스턴스변수
		System.out.println("----,인스턴스변수------");
		
		
		StringConcatImple concat = new StringConcatImple();
		System.out.println(s1 + s2);
		
		//람다식
		System.out.println("----,람다방식------");
		StringConcat concat2 = (s,v) -> System.out.println(s+","+v);
		concat2.makeString("Hello", "world");

		//익명의 내부 클래스방식
		System.out.println("----익명의내부클래스방식------");
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);
				
			}
		};///StringConcat
		concat3.makeString(s1, s2);//호출용
	}

}
