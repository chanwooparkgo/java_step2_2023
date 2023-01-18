package chapter16.generic1;

public class GenMain {

	public static void main(String[] args) {
		
		Gen gen = new Gen();
		
		//정수형
		Integer[] iArr= {1,2,3,4,5 };
		
		//더블형
		Double[] iArr2 = {1.1, 2.1,3.2,4.3, 5.1  };
		//문자형
		Character[] iArr3 = {'A','B','C','D','E' };
		
		for(int i=0; i<iArr2.length; i++) {
			System.out.print(iArr2[i]);
		}
		for(int i=0; i<iArr3.length; i++) {
			System.out.print(iArr3[i]);
		}
		

	}

}
