package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyMain extends CompanyService {

	
	public static void main(String[] args) {
		
		
		
		//Scanner 기능을 사용하기 위해 객체 생성
		Scanner scan = new Scanner(System.in);
		
		
		//CompanyService 클래스를 사용하기 위해 객체 생성
		CompanyService service = new CompanyService();
		
		
		//while문  탈출용도로 사용할 boolean 선언
		 Boolean bo= true;///그냥 암기..........
		int num;
		//직원관리 프로그램을 종료전까지 반복동작시키기 위해 while문 사용
		
		while(bo) {
			System.out.println("1.등록");//saveWorker
			System.out.println("2. 검색");//search()
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = scan.nextInt();
			
			//switch - case 문을 사용하기 위해 key값 입력받기
			switch (num) {
			case 1:
				service.saveWorker();
				break;
			case  2:
				service.search();
				break;
			case  3:
				bo =false;/////
				break;
				
			}
			//원하는 case 문을 사용하기 위해 입력받은 key값 넣어주기
		}//while
		System.out.println("프로그램 종료");

	}//main

}
