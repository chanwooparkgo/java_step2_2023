package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		//try ~ catch사용
		try {
			fis= new FileInputStream("a.txt");//open전용
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}finally {
			try {//close용
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}//trycatch문
		System.out.println("end");
	}//main

}
