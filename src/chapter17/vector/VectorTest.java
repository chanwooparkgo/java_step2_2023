package chapter17.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Object obj;
		//크기1의 배열선언
		Vector<Object> vec= new Vector<Object>(1);//기본초기화값 10
		Vector<Object> vec2= new Vector<Object>(5);//기본초기화값 10
		Vector<Object> vec3= new Vector<Object>(15);//기본초기화값 10
		obj=20221227;
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #1: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #1:"+ vec.size());
		System.out.println();
		
		
		obj="some people";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #2: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #2:"+ vec.size());
		System.out.println();
		
		obj="some people2";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은222 #: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #:"+ vec.size());
		System.out.println();
		
		obj="dream of success";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #3: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #3:"+ vec.size());
		System.out.println();
		
		obj="while";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #4: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #4:"+ vec.size());
		System.out.println();
		
		obj="other people";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #5: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #5:"+ vec.size());
		System.out.println();
		
		obj="other people3";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은333 #: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #:"+ vec.size());
		System.out.println();
		
		obj="get up";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #6: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #6:"+ vec.size());
		System.out.println();
		
		obj="morning";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #7: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #8:"+ vec.size());
		System.out.println();
		
		obj="and make";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #8: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #9:"+ vec.size());
		System.out.println();
		
		obj="it happen";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #9: "+vec.capacity());
		//vector 저장되어 있는 엘리먼트의 수
		System.out.println("크기는 #1:"+ vec.size());
		System.out.println();
		System.out.println(vec);

	}

}
