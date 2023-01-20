package chapter17.treeset;

import java.util.Set;
import java.util.TreeSet;


public class ComparatorTest1 {

	public static void main(String[] args) {
		
		//default 로 오버라이딩 되어있는 String / Integer
		Set<String> set = new TreeSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);
		

	}

}
