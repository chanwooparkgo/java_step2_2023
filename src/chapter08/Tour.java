package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tour {

	public static void main(String[] args) {
		// 관광객 등록
		
		int num=0,b;//
		int count=0;
		int traveler;
		String destination;
		Scanner scan = new Scanner(System.in);
		System.out.println("관광객 수: " );
		int a = scan.nextInt();
		Guide gues2 = new Guide(num);//num값초기화때문에 충돌
		
		for(int i=0; i<num; i++) {
			
		System.out.print("관광객 등록");
		System.out.println("1. 이름: "+ (i+1));
		gues2.guest[i].setName(scan.next());
		System.out.println("1. 성별: "+ (i+1));
		gues2.guest[i].setGender(scan.next());
		Guide.point="가거도";
			
		}
		
		
		while(true) {
			
			System.out.print("1. 관광객정보: ");
			System.out.print("2. 목적지변경: ");
			System.out.print("3. 종료: ");
			System.out.println("선택 >>");
			 int select = scan.nextInt();
			switch(select) {
			case 1:
				for(int i=0; i<a; i++) {
					System.out.println((i+1)+" 이름: "+gues2.guest[i].getName());
					System.out.println((i+1)+" 성별: "+gues2.guest[i].getGender());
					System.out.println((i+1)+" 목적지: "+gues2.guest[i].getPoint());
				}
				break;
				
			case 2:
				System.out.print("어디로변경하시겠습니까?");
				Guide.point=scan.next();
				System.out.println(Guide.point+"로 목적지변경되었습니다");
				break;
				
			case 3:
					System.out.println("종료");
				break;
			}//switch
		}//while

	}

}
