package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		//추상클래스는 객체를 만들수없다
		//Computer c1= new Computer()
		Computer c3 = new Notebook();
		Computer c2 =new Desktop();
		Computer c4 =new MyNoteBook();
		c2.typing();//desktop
		c2.display();//desktop
		c4.display();//notebook
		c4.typing();//notebook
	}

}
