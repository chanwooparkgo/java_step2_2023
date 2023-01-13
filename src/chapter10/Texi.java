package chapter10;

public class Texi extends Vehicle{

	private int texiNum=1005;

	@Override
	public void run() {////vehicle함수로부터의 void함수
		System.out.println(texiNum + "번 택시가 달립니다");
		
	}
	
}
