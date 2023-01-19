package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Oracle");
		list.add("Servlet/JSP");
		list.add(2,"Spring");
		list.add("Python");
		
		int size= list.size();
		System.out.println("총 객체수의 사이즈:"+ size);
		System.out.println();
		//index번호넣어서 해당 인덱스번호 출력
		String skill = list.get(2);
		System.out.println("2:"+skill);

		for(int i=0; i<list.size(); i++) {
			String str= list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);//data에서는 내용이 지워짐..,linkedlist에서는 인덱스번호 찾아가서실행..
		list.remove("Python");
		for(int i=0; i<list.size(); i++) {
			String str= list.get(i);
			System.out.println(i+":"+str);
		}
		
	}

}
