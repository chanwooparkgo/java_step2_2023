package chapter19.Lambda;

public class TestAdd {

	public static void main(String[] args) {
		//람다식 : 메소드이름이 없음 구현부만 존재함
		Add addF = ( x,y) -> x+y ;
		
		System.out.println(addF.add(3, 5));

	}

}
