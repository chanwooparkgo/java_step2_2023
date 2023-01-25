package chapter20;

public class ArrayExceptionMain {

	public static void main(String[] args) {
		
		int[] arr= new int[5];
		/*
		for (int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}//for
		*/
		
		try {
			for (int i=0; i<5; i++) {
				arr[i]=i+1;
				System.out.println(arr[i]);
			}//for
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println(e);
		}finally {
			//에러가 나든 안나든 무조건 수행
			System.out.println("finally");
		}
		System.out.println();
		System.out.println("종료");
	}//main

}
