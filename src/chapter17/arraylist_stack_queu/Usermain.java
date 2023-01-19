package chapter17.arraylist_stack_queu;

import java.util.ArrayList;
import java.util.Scanner;

public class Usermain {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> arr= new ArrayList<UserInfo>();
		outer : while(true) {
			System.out.println("아이디생성:");
			Scanner scan = new Scanner(System.in);
			
			UserInfo ui= new UserInfo();
			ui.setId(scan.next());
			
			//아이디 중복체크
			for(int i=0; i<arr.size(); i++) {
				if(ui.getId().equals(arr.get(i).getId()));
				System.out.println("아이디가중복됩니다 다른아이디를입력하세요");
				continue outer;
			}//for
			
		
		
		
			//중복된 아이디가 아니라면 pwd입력
			System.out.println("패스워드를입력하세요: ");
			Scanner scan2 = new Scanner(System.in);
			ui.setPwd(scan2.nextInt());
			arr.add(ui);
			
			//아이디 중복체크
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println("---------");
			
		}//for
			
		}//while
			
	}//main
	
	
	}//Usermain


