package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		//Map<String integer>생성 map
		Map <String ,Integer> map = new HashMap < > ();
		//팀원 데이터 (성함,학번) 저장
		map.put("박창훈", 1000);
		map.put("이석진", 1001);
		map.put("한성무", 1002);
		map.put("이세정", 1003);
		map.put("장준근", 1004);
		map.put("박찬우", 1005);
		//팀원의 인원
		System.out.println(map.size());
		//팀장의 학번을 알아내자
		System.out.println(map.get("박창훈"));
		//팀원 모두의 학번 출력
		map.clear();
		System.out.println(map.size());
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
						
			while(keyIterator.hasNext()) {
				String key = keyIterator.next();
				Integer value = map.get(key);
				System.out.println("\t" + key + ":" + value);
				}

	}
}
