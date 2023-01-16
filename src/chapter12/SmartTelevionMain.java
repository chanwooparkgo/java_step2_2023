package chapter12;

public class SmartTelevionMain {

	public static void main(String[] args) {
		
		SmartTelevision tv= new SmartTelevision();
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.seatch("www.naver.com");
		System.out.println("---------------------");
		//REMOte 클래스에 정의되어있는 메소드만 오버라딩이 인식되어 사용할수 있음
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		//rc.seatch("www.naver.com");
		
		Searchable sc = tv;
		//sc.turnOn();
		//sc.setVolume(-7);
		//sc.turnOff();
		sc.seatch("www.naver.com");
		
	}

}
