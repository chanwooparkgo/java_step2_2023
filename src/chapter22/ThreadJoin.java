package chapter22;

public class ThreadJoin implements Runnable {

	public static void main(String[] args) {
		
		System.out.println("메인클래스 시작");
		
		ThreadJoin t1 = new ThreadJoin();
		Thread JThread = new Thread(t1);
		JThread.start();
		
		try {
			JThread.join();//run 메소드와 main메소드가 join되어 run()가 완전히 종료될때까지기다림(위 -> 아래)
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("메인 클래스 종료");
	}
/////////////////////////////////////////
	@Override
	public void run() {
		System.out.println("run() 메서드 수행!");
		first();
	}
	
	public void first() {
		System.out.println("first() 메서드 수행!");
		second();
	}
	
	public void second() {
		System.out.println("second() 메서드 수행!");
	}
	

}