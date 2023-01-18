package chapter16.generic2;

public class Water extends Material {

	@Override
	public String toString() {
		
		return "재료는 워터입니다";
	}

	@Override
	public void doprinting() {
		System.out.println("물재료는 불가능합니다");
		
	}
	
	

}
