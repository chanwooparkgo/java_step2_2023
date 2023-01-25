package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest3 {
	//한글깨짐
	
	static FileInputStream fis = null;
	
	
	//FileInputStream fis = null;
	public static void main(String[] args) throws IOException {
		try(FileInputStream fis = new FileInputStream("input2.txt") ) {
			
			byte[] bs = new byte[10];//버퍼로 활용
			int i;
			
			while((i = fis.read(bs)) != -1 ) {
				//버퍼읽기:10개씩 garbage값 출력
				for(byte b:bs) {
					System.out.println((char)b+" ");
				}//10개출력완료
				System.out.println(" :"+ i + "바이트 읽음");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
	
	
	
}
