package chapter14.Clone;

public class ExitMain {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				//System.exit(i);//main메소드에서 나감
				break;//for문종료
			}
		}
		System.out.println("종료코드");

	}

}
