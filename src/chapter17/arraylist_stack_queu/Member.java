package chapter17.arraylist_stack_queu;

public class Member {

	
		private int memberID;
		private String memberName;
	
	
	
	
	public Member(int i, String string) {
			// TODO Auto-generated constructor stub
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
