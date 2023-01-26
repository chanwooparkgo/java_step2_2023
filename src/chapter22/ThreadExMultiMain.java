package chapter22;

public class ThreadExMultiMain {

	public static void main(String[] args) {
		//multithread
		ThreadEx03 t1 = new ThreadEx03();//1 
		ThreadEx03_2 t2 = new ThreadEx03_2();//2
		
		t1.start();
		t2.start();
		//번갈아가면서 실행
		//병행처리
		// ->> 동기화 진행과정
		

	}

}
