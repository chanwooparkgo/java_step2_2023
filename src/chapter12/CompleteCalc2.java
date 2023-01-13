package chapter12;

public class CompleteCalc2 extends CompleteCalc1 {

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		/*
		try {
			return num1/num2;
		}catch(Exception e) {
			return Calc.ERROR
		}
		return num1/num2;
		*/
		if (num2 != 0) {
			return num1/num2;
		}else {
			return Calc.ERROR;
		}
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니까");
	}
	//디폴트메소드의 재정의
	@Override
	public void description() {
		System.out.println("완벽한계산기입니다");
		//super.description();
	}
	
	
}

