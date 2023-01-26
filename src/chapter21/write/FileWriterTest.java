package chapter21.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		
		
		try(FileWriter fw = new FileWriter("writer.txt")) {
			/*
			fw.write('A');
			fw.write(65);
			fw.write("65");
			*/
			//배열
			char[] buf = {'B','C','D','E','F','G' };
			//fw.write(buf);//배열 한꺼번에 저장 writer1.txt
			fw.write(buf, 2, 4);//배열일부분저장writer2.txt
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일생성완료");
	}

}
