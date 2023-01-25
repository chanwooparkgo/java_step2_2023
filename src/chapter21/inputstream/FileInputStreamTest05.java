package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamTest05 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("resouce.txt", true);
				FileInputStream fis = new FileInputStream("resource.txt")){
			//쓰기
			fos.write(65);//A대응되는문자저장
			fos.write(66);//B
			fos.write(67);//C
			//읽기
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
