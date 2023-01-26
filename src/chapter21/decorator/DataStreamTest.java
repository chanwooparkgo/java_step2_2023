package chapter21.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			
			dos.write(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("it s good");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)) {
				
				System.out.println(dis.readByte());
				System.out.println(dis.readChar());
				System.out.println(dis.readInt());
				System.out.println(dis.readFloat());
				System.out.println(dis.readUTF());
			
		} catch (Exception e) {
			
		}
	}//main

}
/*
DataInputStream DataOutputStream : 자바의 기본 자료형 타입의 정보를 입력하고 출력하는데사용

		 * 직렬화
		 * 문자 -> 바이트
		 * 역직렬화 : 바이트 -> 문자
		 * 자바: JVM ( heap, stack memory) 

*/