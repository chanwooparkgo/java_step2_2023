package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		

		method(new LoginService());//public함수에서 끌어온 객체명
		method(new FileDownloadService());//public함수에서 끌어온 객체명
	}

	
	
	//메소드명 method(static)
	public static void method(HttpServlet http) {
		http.service();
	}
}
