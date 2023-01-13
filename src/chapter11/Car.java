package chapter11;

public abstract class Car {

	
	public abstract void drive();
	public abstract void stop();
		
	
	public void startCar() {
		System.out.println("시동을켭니다");
	}
	public final void run() {
		//System.out.println("시동을끕니다");
		startCar();
		drive();
		stop();
		turnOff();
	}
	
	public void turnOff() {
		System.out.println("시동을끕니다");
	}
}
