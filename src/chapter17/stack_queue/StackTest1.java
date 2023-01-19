package chapter17.stack_queue;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
		
		Object obj;
		//empty 스택생성
		Stack<Object> st = new Stack<Object>();
		//입력
		if(st.empty()) {//스택이 비어있으면
			for(int i=0; i<=5; i++) {
				st.push(new String("hi"+i));
				System.out.println("입력"+i+"번째"+st.peek());
			}//for
		}//if

		
		//출력
		st.pop();//밖으로 나오는 5출력
		System.out.println("현재Top의 위치(peak)"+st.peek());
		st.pop();//밖으로 나오는 4출력
		System.out.println("현재Top의 위치(peak)"+st.peek());
		st.push(new String("happy"));
		System.out.println(st.peek());
		st.push(new String("good"));
		System.out.println(st.peek());
	}//main

}//StackTest1
