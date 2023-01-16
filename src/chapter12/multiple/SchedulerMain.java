package chapter12.multiple;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		//char A1 = ' ';
		//char a = ' ';
		//char b = ' ';
		//char c = ' ';
		//char d = ' ';
		//char e = ' ';
		//char f = ' ';
		//char g = ' ';
		//char h = ' ';
		while(true) {
			
			System.out.println();
			System.out.println("R or r:한명씩 차례로 할당");
			System.out.println("L or l:쉬고있거나대기가가장적은ㅁ 상담원에게할당");
			System.out.println("P or p:업무스킬값이 높은상담원에게 할당");
			System.out.println("S or s:종료");
			
			
			System.out.println("전화 상담 방식을 선택하세요:");
			
			//문자를 아스키코드로 형변환
			
			Scheduler scheduler = null;
			//방법1
			char A1 = scan.next().charAt(0);
			
			
			
			
			//charAt(0) 문자 char or String -> ascii 즉 int
			//system.in.read() 콘솔에 입력받기 모든 입력값을 아스키코드값
			//int ch=system.in.read(); ascii코드값
			//방법2
			String mum = scan.nextLine();
			//charAt(0) String -> ascii(int)
			
			/*
			//문자를 아스키코드로 형변환
    	    //방법1
    	    //charAt(0) : 문자(char) 또는 문자열(String) => ASCII 즉 int
			//char input=scan.next().charAt(0); 
			//System.in.read() : 콘솔에 입력받기 모든 이력값을 아스키코드값
			//int ch=System.in.read(); //아스키코드값
			//방법2
			String mun = scan.nextLine();
			int ch = mun.charAt(0); //charAt(0):String -> ACSII(int)
//객체를 생성
			if (ch == 'R' || ch == 'r') {
				scheduler = new RoundRobin();
			} else if (ch == 'L' || ch == 'l') {
				scheduler = new LeastJob();
			} else if (ch == 'P' || ch == 'p') {
				scheduler = new PriorityAllocation();
			} else if (ch == 'S' || ch == 's') {
				System.out.println("업무를 종료합니다.");
				break;
			} else {
				System.out.println("지원되지 않는 기능입니다.");
				continue; //무시
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
       }
			*/
			
			
			
			/////////////////
			/*a = scan.next().charAt(82);
			b = scan.next().charAt(114);
			c = scan.next().charAt(76);
			d = scan.next().charAt(108);
			e = scan.next().charAt(80);
			f = scan.next().charAt(112);
			g = scan.next().charAt(83);
			h = scan.next().charAt(115);
			*/
			
			//객체생성
			//PriorityAllocation prior = new PriorityAllocation();
			
			
			if(A1 == 82 ||A1== 114) {
				System.out.println("R or r:한명씩차례로");
			}else if(A1 ==  76 || A1 == 108) {
				System.out.println("L or l:쉬고있거나대기가가장적은상담원에게할당");
			}else if(A1 == 80 ||A1 == 112) {
				System.out.println("P or p:업무스킬값이 높은상담원에게 할당");
			}else if (A1 == 83 || A1 == 115) {
				System.out.println("S or s:종료");
				break;
			}
			
			
			
		}

	}

}
