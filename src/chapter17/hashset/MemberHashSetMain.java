package chapter17.hashset;


import java.util.HashSet;
import java.util.Set;

import chapter17.arraylist_stack_queu.Member;

public class MemberHashSetMain {

	public static void main(String[] args) {
		
		Set<Member> set= new HashSet<Member>();
		
		set.add(new Member(30,"홀길동"));
		set.add(new Member(30,"홀길동"));//저장하면 안됨
		System.out.println("총 객체수: "+ set.size());

	}

}
