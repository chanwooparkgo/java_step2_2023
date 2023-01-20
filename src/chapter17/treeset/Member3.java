package chapter17.treeset;

import java.util.Comparator;

public class Member3 implements Comparator<Member3>{

//public class Member3 implements Comparable<Member3> { 
		private int memberID;
		private String memberName;
	
	
	
	
	public Member3(int i, String string) {
			// TODO Auto-generated constructor stub
		}




	public Member3() {
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




	



	//물리적인 값
	@Override
	public int hashCode() {
		 //memberName.hashCode() String이므로 10진수
		//return super.hashCode();  10진수 메모리주소
		//방법1
		//return memberName.hashCode()+memberID;
		//방법2
		return memberName.hashCode()+memberID;
	}




	



	//논리적인 값
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member= (Member2)obj;
			return member.memberName.equals(memberName)&& (member.memberID==memberID);
		}else {			
			return false;
		}
	}*/
	//방법2
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member3) {
			Member3 member =(Member3)obj;
			/////
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return getMemberName() +"회원님의 아이디는 "+ memberID+"입니다";
	}



	/*
	 *comparable
	@Override
	public int compareTo(Member3 member) {
		
		return (this.memberID-member.memberID);
	}
	*/



	@Override
	public int compare(Member3 member1, Member3 member2) {
		
		return member1.memberID - member2.memberID;
	}
	

}
