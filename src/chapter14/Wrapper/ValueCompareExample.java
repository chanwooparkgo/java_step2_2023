package chapter14.Wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		//오토박싱상황에서는 1byte초과시 비교판단이 안됨
		System.out.println("[-128~128초과값일경우]");//1byte= 8bit
		Integer obj1 =300;//4byte -> 32bit
		Integer obj2=300;
		
		
		//주소를비교
		System.out.println("==결과:"+(obj1==obj2));//외부
		System.out.println("==언박싱한후 결과:"+(obj1.intValue()==obj2.intValue()));//내부
		
//////////////////////
		System.out.println("[-128~128범위값일경우]");//1byte= 8bit
		Integer obj3 =100;//4byte -> 32bit
		Integer obj4=300;
		
		
		//주소를비교
		System.out.println("==결과:"+(obj3==obj4));//외부
		System.out.println("==언박싱한후 결과:"+(obj3.intValue()==obj4.intValue()));//내부
		System.out.println("==equals 결과:"+obj3.equals(obj3));//내부
		
	}

}
