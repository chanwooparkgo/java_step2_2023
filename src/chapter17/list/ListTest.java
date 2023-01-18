package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// 리스트 구조를 갖는 ArrayList클래스의 객체생성
		//String[] ls1 =  {}; //수정이 힘듦
		List<String> ls = new ArrayList<String>();
		//리스트에 데이터추가
		ls.add("Hi");
		ls.add("Happy");
		ls.add("Nice");
		List<Integer> ls2 = new ArrayList<Integer>();
		ls2.add(0);
		ls2.add(10);
		ls2.add(100);
		
		List<Double> ls3 = new ArrayList<Double>();
		ls2.add(0);
		ls2.add(10);
		ls2.add(100);
		
		
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i+":"+ ls.get(i).toString());
		}
		System.out.println();
		System.out.println("----데이터 추가후-----");
		
		ls.add(3, "Good");
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i+":"+ ls.get(i).toString());
		}
		
		System.out.println();
		System.out.println("----데이터 삭제 후-----");
		
		ls.remove(0);
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i+":"+ ls.get(i).toString());
		}
		
	}

}
