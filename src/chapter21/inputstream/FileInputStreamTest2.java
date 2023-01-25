package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
	//한글깨짐
	
	static FileInputStream fis = null;
	
	
	//FileInputStream fis = null;
	public static void main(String[] args) throws IOException {
		try {
			int i;
			//fis.read();  //파일을 끝까지 읽으면 -1을반환
			fis = new FileInputStream("input.txt");
			while((i = fis.read()) != -1 ) {
				System.out.println((char)i+" ");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
				//nullPointerException을 잡지못해서 죽음
				//catch
			}catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
	
	
	
}
