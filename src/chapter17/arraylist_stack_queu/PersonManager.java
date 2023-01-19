package chapter17.arraylist_stack_queu;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr= new ArrayList<Person>();
		
		while(true) {
			System.out.println("1.회원추가");
			System.out.println("2.회원탈퇴");
			System.out.println("3.회원정보");
			System.out.println("4.종료");
			System.out.print("항목선택: ");
			
			Scanner scan = new Scanner(System.in);
			select= scan.nextInt();
			//int a;
			//if switch
			
			if(select == 1) {
				p=new Person();
				System.out.println("정보입력");
				System.out.println("이름:");
				p.setName(scan.next());
				System.out.println("나이: ");
				p.setAge(scan.nextInt());
				System.out.println("전화번호:");
				p.setTel(scan.next());
				System.out.println("===========");
				personArr.add(p);
				System.out.println("정보가저장되었습니다");
				break;
				
			}else if(select ==2) {
				System.out.println("삭제");
				System.out.println("삭제할 이름:");
				String name = scan.next();
				for(int i=0; i<personArr.size(); i++) {
					if((personArr.get(i).getName()).equals(name)) {
						personArr.remove(i);
						System.out.println(name+"의정보를삭제했습니다");
						break;
						
					}else {
						if(i+1 == personArr.size())
							System.out.println(name+"이 존재하지않습니다");
					}
				}//for
			} else if(select ==3 ) {
				for(int i=0; i<personArr.size(); i++) {
					System.out.println("회원번호"+ (i+1));
					System.out.println("이름"+ personArr.get(i).getName());
					System.out.println("나이"+ personArr.get(i).getAge());
					System.out.println("전화번호"+ personArr.get(i).getTel());
				}//for
			} else {
				System.out.println("종료");
				break;
			}
			
			
		}//while
	}//PersonMgr
	
	public void addcasting() {
		
	}
}//PersonManager
