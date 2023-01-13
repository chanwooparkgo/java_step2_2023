package chapter10;

public class SupersonicAriplane extends Airplane {

	//Normal=1 SUPERSONIC=2
	//필드(전역변수,변경할수 없게 선언)
	public static final int NORMAL =1;
	public static final int SUPERSONIC =2;
	
	public int flymode=NORMAL;//1
	//오버라이딩을 이용하여 flymode가  SUPERSONIC이면 초음속 비행입니다 그렇지 않으면 Airplane의 fly를실행한다

	@Override
	public void fly() {
		
		Airplane air = new Airplane();
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행입니다");
		}else {
			super.fly();
		}
		
	}
	
	
}
