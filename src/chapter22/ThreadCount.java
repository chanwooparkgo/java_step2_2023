package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable {

	private int n;
	public ThreadCount(int n) {
		this.n=n;
	}
	
	public static void main(String[] args) {
		
		/*스캐너이용해 키보드에서 숫자입력받고
		입력받은 숫자가 1씩 감소하다가 0이 되었을때
		"종료" 라는 메세지와 함꼐 스레드를 빠져나오도록구현하시오
		*/
		
		System.out.println("값을 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		ThreadCount tc = new ThreadCount(num);
		//스레드 객체 및 실행
		Thread tc2 = new Thread();
		tc2.start();
		
		
		

	}

	@Override
	public void run() {
		for(int i=n; i>=0; i--) {
			
			try {
				System.out.println("시작은" +i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("end");
	}

}
