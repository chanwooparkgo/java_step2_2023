package chapter17.arraylist_stack_queu;

public class Member {

	
		private int memberID;
		private String memberName;//필드지정 타입
	
	
	
	/*
	public Member(int memberID, String memberName) {
			this.memberID=memberID;
			this.memberName=memberName;
		}	//필드지정과 메인에서 불러들일 매개변수 
*/

	public Member(int i, String j) {
		memberID=i;
		memberName=j;
	}


	public int getMemberID() {
			return memberID;
		}




		public void setMemberID(int memberID) {
			this.memberID = memberID;
		}




		public String getMemberName() {
			return memberName;
		}




		public void setMemberName(String memberName) {
			this.memberName = memberName;
			this.memberID = memberID;
		}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getMemberName() +"회원님의 아이디는 "+ memberID+"입니다";
	}
	
	

}
