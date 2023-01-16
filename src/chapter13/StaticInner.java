package chapter13;

public class StaticInner {

	int a=10;
	private int b=100;
	static int c=200; //데이타영역 메모리(공용)
	
	//생성자
	
	//메소드
	
	//내부클래스
	static class Inner{//inner클래스중 혹 이름이 없을수 있음
		//필드
		static int d=1000;
		//생성자
		//메소드
		public void printData() {
			//a와b는 static이 아니면서 데이터영역에서 사용할 수 없음 힙메모리,스택메모리는 불가
			//외부 static과 달리 내부클래스에서는 필드영역과 같이쓸수없음
			//System.out.println("int a:"+a);
			//System.out.println("private int a:"+b);
			System.out.println("static  c:"+c);
			System.out.println("static  d:"+d);
		}
	}//static inner
	
	
	public static void main(String[] args) {
		Inner inner = new Inner();
		inner.printData();
	}

}
