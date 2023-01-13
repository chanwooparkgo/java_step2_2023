package chapter09;

public class Berry extends Fruit {

	public String name;
	public String size;
	
	//setter
		public void Set2(String a, String b) {
			name=a;
			size=b;
			
		}

		//getter

		public void Disp2() {
			System.out.println("이름:" +name);
			System.out.println("사이즈:" +size);
		}
}
