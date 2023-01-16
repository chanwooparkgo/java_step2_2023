package chapter12;

public class InterMain {

	public static void main(String[] args) {
		InterTest2 it = new InterTest2() {
			
			@Override
			public int getA() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		System.out.println("getA()"+ it.getA());
	}
}
