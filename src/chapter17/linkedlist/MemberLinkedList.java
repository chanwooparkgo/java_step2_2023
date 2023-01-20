package chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.arraylist_stack_queu.Member;

public class MemberLinkedList {

	
	public static void main(String[] args) {  }
		
		private LinkedList<Member> linkedList;
		//생성자를 통한 LinkedList객체 생성
		
		public MemberLinkedList() {
			linkedList = new LinkedList<Member>();
		}
		LinkedList<String> list = new LinkedList<String>();
		
		
		//addMember 
		/*list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");*/
		
		public void addMember(Member member) {
			linkedList.add(member);
		}
		
		//removeMember
		/*System.out.println(list);
		list.add(2, "lotto");
		System.out.println(list);
		list.addFirst("E");
		System.out.println(list);
		list.addFirst("A");*/
		
		public boolean removeMember(int memberId) {
			Iterator<Member> ir = linkedList.iterator();
			while(ir.hasNext()) {
				Member member = ir.next();
				int tempId=member.getMemberID();
				if (tempId == memberId) {
					linkedList.remove(member);
					return true;
				}//if
			}//while
			System.out.println(memberId+"존재하지않습니다");
			return false;
		}//removemember
		
		//showAllMember
		public void showAllMember() {
			for(Member member: linkedList ) {
				System.out.println(member);
			}
			System.out.println();
		}
		

	
}
