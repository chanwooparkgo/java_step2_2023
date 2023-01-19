package chapter17.arraylist_stack_queu;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	//ArrayList선언(arrayList)
	public MemberArrayList() {
		//heap생성
		arrayList = new ArrayList<Member>();
		
	}
	
	//저장 arrayList에 add하는 메소드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	//삭제 arrayList에 remove하는 메소드
	public  boolean removeMember(int memberId) {
		Iterator<Member> it = arrayList.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempId =member.getMemberID();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}//if
		}//while
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
	}
	//정보출력 메소드: arrayList출력하기
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
