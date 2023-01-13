package chapter10;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//Main에서 실행하여 아래와 같은 결과가 나오면 성공
				//CalPlus : 30
				//CalMinus : 15
		/*
		CalPlus plus = new CalPlus();
		plus.getResult(10, 20);
		System.out.println(plus.getResult(10, 20));
		CalMinus minus = new CalMinus();
		minus.getResult(20, 5);
		System.out.println(minus.getResult(20, 5));
		*/
		//////////방법2
		
		calc(new CalPlus(),20, 10);//c1객체,a,b객체 충족 Calc c1=new CalcPlus();
		
		System.out.print("정수 A를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = scan.nextInt();
		
		int plus=calc(new CalPlus(),a,b);
		System.out.println("두수의합:"+plus);
		int minus=calc(new CalMinus(),a,b);
		System.out.println("두수의차:"+minus);

	}
	
	
	
	public static int calc(CalculatorExam c1,int a, int b) {
		return c1.getResult(a, b);
	}

}
