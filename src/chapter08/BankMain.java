package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		Bank bk1 = new Bank("강남점","010-1111-2222");
		//bk1.interset0.2f;
		Bank.interset=0.2f;
		bk1.getBank();
		
		System.out.println("--------------------");
		Bank bk2 = new Bank("일산점","010-1111-4444");
		bk2.getBank();
		
		//방법2
		String point =null;
		String tel=null;
		Scanner s= new Scanner(System.in);
		
		point=JOptionPane.showInputDialog("지점명");
		point=JOptionPane.showInputDialog("전화번호");
		Bank bank = new Bank(point, tel);
		
		System.out.println(point + "의 이자를 입력하세요");
		Bank.interset=s.nextFloat();
		
		
	}

}
