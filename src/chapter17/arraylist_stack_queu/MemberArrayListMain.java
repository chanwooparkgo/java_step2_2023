package chapter17.arraylist_stack_queu;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList= new MemberArrayList();
		
		Member memberLee= new Member(1001,"이지원");
		Member memberSon= new Member(1002,"손민국");
		Member memberPark= new Member(1003,"박시원");
		Member memberHong= new Member(1004,"홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee);

		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberHong.getMemberID());
		
		memberArrayList.showAllMember();
	}

}
