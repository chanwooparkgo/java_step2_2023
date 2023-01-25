package chapter21.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIReaderStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		fis = new FileInputStream("reader.txt");
		int i;
		try(FileReader fr = new FileReader("reader.txt")) {
			while((i=fr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
