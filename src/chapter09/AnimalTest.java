package chapter09;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람은 두발로 움직입니다");
	}
	public void readbook() {
		System.out.println("사람은 책을 읽습니다");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이는 네발로 움직입니다");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리는 하늘을 납니다");
	}
	public void flying() {
		System.out.println("독수리는 날아다닙니다");
	}
}



public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		//자바8버전이상부터 활용방법
		//Animal animal= new Human();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());

	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
