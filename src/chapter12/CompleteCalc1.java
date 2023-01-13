package chapter12;
//상속받아서 + - 구현( add/ substract)
public abstract class CompleteCalc1  implements Calc  {

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int substaract(int num1, int num2) {
		
		return num1-num2;
	}

	

	
	
}
