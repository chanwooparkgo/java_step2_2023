package chapter14.Clone;

public class ArrayClonetest {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5 };
		int[] arr2;
		
		arr2=arr1.clone();
		System.out.println("복사도니arr2배열");
		for(int num:arr2) {
			System.out.print(num+" ");
		}

		arr2[3]=0;
		System.out.print("===>");
		System.out.println("변경 후 arr1배열");
		for(int num:arr1) {
			System.out.print(num+" ");
		}
		System.out.print("===>");
		System.out.println("변경 후 arr2배열");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}//깊은복사
	}

}
