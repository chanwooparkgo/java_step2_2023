package chapter13;


class Outter2{
	//익명의클래스는인스턴스이름이없다
	Runnable getRunnable(int i) {
		int num=100;
		//new와 동시에 부모클래스의 run메소드를 상속받아서 수상메소드인 run을 반드시 오버라이딩해서
		//사용한다
		return new Runnable() {
			
			@Override
			public void run() {
				//num=200;
				//i=10;//final
				System.out.println(i);
				System.out.println(num);
			}
		};//return자리	
	}//runable
	//방법1
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명의 클래스 변수");
			
		}
	};//두번째runnable
	//방법2
	
}

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		Outter2 out =new Outter2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();//방법1
		out.runner.run();//방법2

	}

}
