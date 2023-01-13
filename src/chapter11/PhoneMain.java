package chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone phone =new Phone();//추상메소드가없어서사용불가

		SmartPhone smartPhone = new SmartPhone("김유신");
				
		
		System.out.println(smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.turnOff();
		//smartPhone.intersearch();
	}

}
