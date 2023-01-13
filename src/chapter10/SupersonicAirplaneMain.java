package chapter10;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		SupersonicAriplane sa=new SupersonicAriplane();
		sa.takeoff();
		sa.fly();
		sa.flymode=SupersonicAriplane.SUPERSONIC;
		sa.fly();
		sa.flymode=SupersonicAriplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
