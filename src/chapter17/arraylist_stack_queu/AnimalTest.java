package chapter17.arraylist_stack_queu;

import java.util.ArrayList;

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

	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		
	//addAnimal -> 업캐스팅 메소드
	AnimalTest ani = new AnimalTest();
	ani.addAnimal();
	System.out.println("==============");
	//testCasting -> 다운캐스팅 메소드
	ani.testCasting();
		
		

	}
	public void addAnimal() {
		aniList.add(new Human());//ArrayList: Animal형으로 자동형변환
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani: aniList) {
			ani.move();
			
		}
	}
	
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);//부모ArrayList의객체를 ani객체에저장
			
			if(ani instanceof Human) {
				Human h=(Human)ani;//다운캐스팅(수동형변환)
				h.readbook();
			}else if(ani instanceof Tiger) {
				Tiger t=(Tiger)ani;//다운캐스팅(수동형변환)
				t.hunting();
			}else if (ani instanceof Eagle) {
				Eagle e=(Eagle)ani;//다운캐스팅(수동형변환)
				e.flying();
			}else {
				System.out.println("지원되지않는타입");
			}//if
		}//for				
	}//testCasting

}//AnimalTest
