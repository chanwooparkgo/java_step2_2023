package chapter22;

public class ThreadEx02_Main {

	public static void main(String[] args) {
		ThreadEx02 t1 = new ThreadEx02();//1~10까지의 요소가 temp변수ㅎ방에 초기화 됨
		
		t1.start();//start()메소드수행하면 내부에 run()메소드가 수행된다
		try {
			Thread.sleep(8000);//2초대기
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
