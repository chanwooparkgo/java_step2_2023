package chapter12;

public class CalcMain {

	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		
		Calc calc = new CompleteCalc2();
		System.out.println("---defaultmethod----");
		calc.description();///디폴트메소드호출
		System.out.println();//CompleteCalc2
		
		System.out.println("---static method------");
		int[] arr= { 1,2,3,4,5};
		System.out.println("1~5까지의합:"+Calc.total(arr));
		System.out.println();
		
		System.out.println("----interface method----");
		System.out.println("num1+num2"+calc.add(num1, num2));
		System.out.println("num1-num2"+calc.substaract(num1, num2));
		System.out.println("num1*num2"+calc.times(num1, num2));
		System.out.println("num1/num2"+calc.divide(num1, num2));
		System.out.println();//CompleteCalc1&CompleteCalc2(num1,num2)계산값 호출
		
		System.out.println("-----child method-----");
		CompleteCalc2 calc2=new CompleteCalc2();
		calc2.showInfo();//CompleCalc클래스 cathch문
	}

}
