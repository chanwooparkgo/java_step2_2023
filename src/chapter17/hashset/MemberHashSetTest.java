package chapter17.hashset;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member2;
import chapter17.arraylist_stack_queu.Member;

public class MemberHashSetTest {

	
	public static void main(String[] args) {  
		
	
	      //순서 O , 중복 O
	      MemberHashSet memberHashSet=new MemberHashSet();
	      
	      //팀원들의 정보
	      Member2 memberPark = new Member2(1001, "박창훈");
	      Member2 memberLee = new Member2(1002, "이석진");
	      Member2 memberLee2 = new Member2(1003, "이세정");
	      Member2 memberPark2 = new Member2(1004, "박창우");
	      Member2 memberJang = new Member2(1005, "장준근");
	      Member2 memberHan = new Member2(1006, "한성무");
	      
	      memberHashSet.addMember2(memberPark);
	      memberHashSet.addMember2(memberLee);
	      memberHashSet.addMember2(memberLee2);
	      memberHashSet.addMember2(memberPark2);
	      memberHashSet.addMember2(memberJang);
	      memberHashSet.addMember2(memberHan);
	      
	      memberHashSet.showAllMember2();
	      
	      memberHashSet.removeMember2(1003);
	      memberHashSet.showAllMember2();
	      //방법1
	      //Member2 memberKim=new Member2(1003, "김치맨");
	      //방법2
	      //memberHashSet.addMember2(memberKim);
	      memberHashSet.showAllMember2();
	      
	   }
	}
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*

		private LinkedList<Member> linkedList;
		//생성자를 통한 LinkedList객체 생성
		
		public MemberHashSetTest() {
			linkedList = new LinkedList<Member>();
		}
		LinkedList<String> list = new LinkedList<String>();
		
		
		addMember 
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		public void addMember(Member member) {
			linkedList.add(member);
		}
		
		removeMember
		System.out.println(list);
		list.add(2, "lotto");
		System.out.println(list);
		list.addFirst("E");
		System.out.println(list);
		list.addFirst("A");
		
		public boolean removeMember(int memberId) {
			Iterator<Member> ir = linkedList.iterator();
			while(ir.hasNext()) {
				Member member = ir.next();
				int tempId=member.getMemberID();
				if (tempId == memberId) {
					linkedList.remove(member);
					return true;
				}
			}
			System.out.println(memberId+"존자하지않습니다");
			return false;
		}
		
		showAllMember
		public void showAllMember() {
			for(Member member: linkedList ) {
				System.out.println(member);
			}
			System.out.println();
		}

 

		*/
	

