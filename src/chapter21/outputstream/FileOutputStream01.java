package chapter21.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output1.txt");//전체저장
		//FileOutputStream fos = new FileOutputStream("output2.txt");//특정인덱스지정해서저장
		try(fos) {
			
			byte[] bs = new byte[26];
			byte data=65;//A
			
			for(int i=0; i<bs.length; i++) {
				bs[i]=data;
				data++;
			}
			//fos.write(bs);//배열한꺼번에저장 input1.txt
			fos.write(bs,2,10);//배열의2번방부터 10개만 input2.txt
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("자장이 완료되었습니다");
	}

}
