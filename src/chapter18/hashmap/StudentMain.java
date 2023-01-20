package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		//학생정보 , 점수
		Map <Student, Integer> map = new HashMap<Student, Integer>();
		//중복데이터허용안함
		map.put(new Student(1,"홍길동"),95 );
		map.put(new Student(1,"김민즈"),95 );
		map.put(new Student(2,"서주히"),95 );
		map.put(new Student(3,"하동길"),95 );
		map.put(new Student(4,"제임스"),95 );
		
		//저장된 총 entry수 출력
		
		//하나씩 처리하는방법
		Set<Student> KeySet = map.keySet();
		Iterator<Student> KeyIterator = KeySet.iterator();

		while(KeyIterator.hasNext()) {
			Student key = KeyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+ key + " : "+ value);
		}
		System.out.println();
		
		
		Scanner scan = new Scanner(System.in);
		Student std;
		int input;
		String name;
		while(true) {
		System.out.println("총 entry수:"+ map.size());
		System.out.println("학생번호를입력하세요:");
		input=scan.nextInt();
		System.out.println("학생이름을 입력하세요:");
		name=scan.next();
		std = new Student(input, name);
		
		System.out.println(map + "학생의 점수는: "+ map );
		
		if(map.containsKey(std)) {
			System.out.println(name + "학생의점수는"+map.get(std));
			break;
		}else {
			System.out.println("해당학생의데이터무존재");
		}
		
		
		
		
		}
		
		
		

	}

}