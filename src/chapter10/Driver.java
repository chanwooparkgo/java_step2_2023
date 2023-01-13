package chapter10;

public class Driver extends Vehicle {

	public void drive(Vehicle vehicle) {///vehicle 각각의 파생객체
		vehicle.run();
	}
}
