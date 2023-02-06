package chapter23.socket01;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	//필드
	ServerSocket ss;
	//생성자
	public MyServer() {
		
		try {
			//클라이언트 접속할때 필요한 포트 번호를 반두시 지정해야하며
			//서비스 포트번호는 3000번대를 사용하는것이 일반적이다
			ss = new ServerSocket(3000);//서버준바완료
			System.out.println("서버완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//생성자
	
	
	
	@Override
	public void run() {
		
		while(true) {
			//접속자가 올때까지 대기
			try {
				Socket s = ss.accept();//접속자받아들임
				String ip =  s.getInetAddress().getHostAddress();
				System.out.println(ip +"왔다감");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



	public static void main(String[] args) {
		
		MyServer ms = new MyServer();
		ms.start();
		
		//new MyServer().start();//8version
	}
}
