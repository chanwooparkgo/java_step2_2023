package chapter11;

public class LoginService extends HttpServlet {
////////////////LoginService가 static 메인함수에서의 객체명
	@Override
	public void service() {
		System.out.println("로그인합니다");
		
	}

}
