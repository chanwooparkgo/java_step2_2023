package chapter21.inputstream;

import java.io.IOException;

public class SystemTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳하나를 쓰고 enter키를 누르세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);//아스키코드
			System.out.println((char)i);//문자
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
