package chapter09;

public class SportsCar extends  Car {

	public void speedup() {
		speed += 10;
		System.out.println("speed: "+ speed);
	}
	
	/*
	public  void stop() {
		System.out.println("스포츠카가 멈춥니다");
		speed+=1;
	}*/
	
	public static void main(String[] args) {
		
		SportsCar ac = new SportsCar();
		ac.speedUp();
		System.out.println(ac.speed);
		ac.stop();

	}

}
