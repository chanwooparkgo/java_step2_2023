package chapter21.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	String name;
	String job;
	//transient:직렬화 하지 않겠다(byte로 변환하지 않겠다)
	//transient String number;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		
		return name+ ","+ job;
	}
	
	
	
	
}


public class SerializationTest {

	public static void main(String[] args) {
		
		Person personhong = new Person("홍길동","대표이사");
		Person personkim = new Person("김연아","운동선수");
		
		//ObjectOutputStream: 파일이나 네트워크로 데이터를 전달하기 위해 직렬화를 수행해줌
		//writeObject() 직렬화 함수
		
		/////////////////////직렬화////////////////////////////////
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			//직렬화
			oos.writeObject(personkim);
			oos.writeObject(personhong);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		///////////////////////////역 직렬화//////////////////////
		/*
		 * ObjectInputStream: 파일이나 네트워크를 통해 전달 받은  직렬화된 데이터를 다시 원래대로
		 * 돌리는 역활(= 역직렬화)
		 * readObject(): 역직렬화에 사용되는 메소드
		 * 직렬화 하기 전 객체로 캐스팅해줘야 함
		 */
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main
}
