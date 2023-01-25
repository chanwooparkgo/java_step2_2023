package chapter19.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		//객체 생성
		TravelCustomer  travel = new  TravelCustomer("이순신",30,28000);
		TravelCustomer  travel2 = new  TravelCustomer("이순2",30,28000);
		TravelCustomer  travel3 = new  TravelCustomer("이순3",30,28000);
		
		//추가
		customerList.add(travel);
		customerList.add(travel2);
		customerList.add(travel3);
		
		
		System.out.println("고객 명단 추가된 순서대로 출력");
		//map: 데이터를 특정조건에 해당하는 값으로 변환해 줌
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		//mapToInt : int형 자료로 변환
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총수입"+total);
		//filter: 특정 조건에 맞는 데이터를 걸러낸다
		System.out.println("20세이상의 고객만정렬하여출력");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}

}
