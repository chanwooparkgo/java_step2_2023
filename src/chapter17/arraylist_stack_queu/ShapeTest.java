package chapter17.arraylist_stack_queu;

import java.util.ArrayList;

class Shape{
	void draw() {
		System.out.println("draw shape");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw circle");
	}
	
	void Circle() {
		System.out.println("원모양입니다");
	}
	
}

class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw ractangle");
	}
	
	void Rectangle() {
		System.out.println("사각형모양입니다");
	}
	
}

class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void Triangle() {
		System.out.println("삼각형모양입니다");
	}
	
}


public class ShapeTest {
	//shape와 shape를 상속받은 모든 클래스 타입이 사용하는 ArrayList
	ArrayList<Shape> sList = new ArrayList<Shape>();

	public static void main(String[] args) {
		ShapeTest sTest = new ShapeTest();
		System.out.println("---업캐스팅---");
		sTest.addShape();//Shape sc = new Circle
		System.out.println("---다운캐스팅---");
		sTest.testCasting();
	}
	
	public void addShape() {
		sList.add(new Circle());//Circle s = new Circle();
		sList.add(new Triangle());
		sList.add(new Rectangle());
		
		for(Shape s:sList) {
			s.draw();
		}
	}
	
	public void testCasting() {
		for(int i=0; i<sList.size(); i++) {
			Shape s = sList.get(i);//일반부모(Shape)타입으로 가져옴
			
			if(s instanceof Circle) {
				Circle c=(Circle)s;//다운캐스팅(수동형변환)
				c.Circle();
			}else if(s instanceof Rectangle) {
				Rectangle r=(Rectangle)s;//다운캐스팅(수동형변환)
				r.Rectangle();
			}else if (s instanceof Triangle) {
				Triangle t=(Triangle)s;//다운캐스팅(수동형변환)
				t.Triangle();
			}else {
				System.out.println("지원되지않는타입");
			}
		}
	}
}	
					

