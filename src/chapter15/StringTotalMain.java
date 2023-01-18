package chapter15;

import java.util.StringTokenizer;

public class StringTotalMain {

	public static void main(String[] args) {
		
		
		//Tokenizer
		//StringTokenizer(1,2,3)
		//1 -> 사용할 String 문자열
		//2 -> 분리하는 기준
		//3 -> 자르는 기준을 표시할 건지 여부
		String str = "have,a,nice,day";
		StringTokenizer obj =new StringTokenizer(str , "," , false);
		
		while(obj.hasMoreTokens()) {
			String t = obj.nextToken();
			System.out.println(t);
		}
	}

}
