package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService extends CompanyBasics {

	/*
	 * 1. 등록
2. 검색
3. 종료
>>> 2
저장되있는 직원 정보가 없습니다.
1. 등록
2. 검색
3. 종료
>>> 1

	 * 등록할 직원의 이름을 입력하세요 : 김창우
등록할 직원의 부서를 입력하세요 : 개발팀
등록할 직원의 주소를 입력하세요 : 일산
등록할 직원의 생일을 입력하세요 : 12월25일
1. 등록
2. 검색
3. 종료
>>> 2
찾으려는 직원의 이름을 입력하세요 : 김창우
이름 : 김창우
 부서 : 개발팀
 주소 : 일산
 생일 : 12월25일

1. 등록
2. 검색
3. 종료
>>> 3
프로그램 종료
강사최규리오전 10:44
>>> 2
찾으려는 직원의 이름을 입력하세요 : b
찾으려는 직원의 이름을 없습니다
	 */
	CompanyBasics basics = new CompanyBasics();
	ArrayList<CompanyBasics> com = new  ArrayList<CompanyBasics>();
	Scanner scan = new Scanner(System.in);
	
	
	public void saveWorker() {///부모클래스로부터 객체를 통해 받아 부모클래스로부터 set으로 받음
		
			System.out.print("등록할직원의이름을입력하세요");
			basics.setName(scan.next());
			System.out.print("등록할직원의부서을입력하세요");
			basics.setPart(scan.next());
			System.out.print("등록할직원의주소을입력하세요");
			basics.setAddr(scan.next());
			System.out.print("등록할직원의생일을입력하세요");
			basics.setBirthday(scan.next());
			com.add(basics);
		
	}//saveworker
	
	public void search() {
		
		if(com.size()==0) {
			System.out.println("등록된 인원이 없습니다.");
		} else { 
			System.out.print("이름입력 : ");
			String sname = scan.next();
			for(int i =0; i<com.size();i++) {
				if(sname.equals(com.get(i).getName())) {///이름값만 입력받아서 검색을함(부모클래스로부터get요청)
					System.out.println(com.get(i));//override toString함수로부터 요청 제어문안에서(이름,주소,부서,생일)
				}else {
					System.out.println("검색된 인원이 없습니다.");//입력받은 검색값 외의 검색어(이름)을입력받았을때
				}//inner if
			}//for
			
		}//outer if
		
	}//search
	
	
	
	
	
}
