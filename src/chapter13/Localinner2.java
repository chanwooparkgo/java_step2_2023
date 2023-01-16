package chapter13;

class Outter{
	//외부클래스 멤버변수
	int outNum=100;
	static int sNum=200;
	
	//Runnable매개변수와 멤버변수는 final로 정의한다
	Runnable getRunable(int i) {
		int num=100;//final
		class MyRunnable implements  Runnable {
			int localNum =10;//내부클래스의 멤버변수

			@Override
			public void run() {
				//num=200; //final
				//i=100;//final
				System.out.println("i="+i);
				System.out.println("num="+num);
				System.out.println("localNum="+localNum);
				System.out.println("outNum="+outNum+"(외부)");
				
			System.out.println("outter.sNum"+Outter.sNum+"(외부data영역)");
			}//run()
			
			
		}//runable
	return new MyRunnable();
	
}//method
	
}//외부클래스


public class Localinner2 {

	public static void main(String[] args) {
		Outter  out = new Outter();
		Runnable runner = out.getRunable(20);
		runner.run();
		
	}

}
