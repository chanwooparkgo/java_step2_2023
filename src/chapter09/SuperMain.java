package chapter09;

public class SuperMain {

	public static void main(String[] args) {
		Paprika obj=new Paprika();
		obj.Set1("피망류", "이름", "노랑파프리카");//부모클래스의생성자
		obj.Set1("빨강", 7000, "빨강파프리카");
		
		obj.Disp1();
		obj.Disp2();

	}

}
