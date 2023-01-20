package chapter17.hashset;

import java.util.HashSet;

public class SetNumber {

	public static void main(String[] args) {
		// 정렬안됨 / 중복안됨

		HashSet<Integer> hs = new HashSet<Integer>();
		while(true) {
			//난수발생
			int v= (int)Math.random()*45+1;
			//int v2=  new random().nextInt(45)+1;
			
			hs.add(v);
			if(hs.size()>=6)
				break;	
			
		}//while
		System.out.println(hs);
	}//main

}
