package chapter17.linkedlist;

import chapter17.arraylist_stack_queu.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		//순서 ok, 중복 ok
		MemberLinkedList LinkedList = new MemberLinkedList();
		
		Member memberLee= new Member(1001,"이지원");
		Member memberSon= new Member(1002,"손민국");
		Member memberPark= new Member(1003,"박시원");
		Member memberHong= new Member(1004,"홍길동");
		
		LinkedList.addMember(memberLee);
		LinkedList.addMember(memberSon);
		LinkedList.addMember(memberPark);
		LinkedList.addMember(memberHong);

		
		LinkedList.showAllMember();
		
		//Member memberKim = new Member(1003,"김서우");
		//LinkedList.addMember(memberKim);
		LinkedList.showAllMember();

	}

}
