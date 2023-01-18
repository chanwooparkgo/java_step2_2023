package chapter15;

public class StBufferMain2 {

	public static void main(String[] args) {
		
		String javaStr=new String("java");
		//처음생성된 메모리의 주소
		System.out.println("javaStr의 처음 생성된 메모리 주소:"+ System.identityHashCode(javaStr));

		StringBuffer buffer=new StringBuffer();
		
		System.out.println("연산전 buffer 메모리주소:"+ System.identityHashCode(buffer));
		buffer.append("and ");
		buffer.append("JSP ");
		buffer.append("programming is fun!! ");
		System.out.println("연산 후 buffer 메모리주소:"+ System.identityHashCode(buffer));
		//Type error => toString
		System.out.println(buffer);
		javaStr=buffer.toString();
		System.out.println("새로만들어진 javaStr메모리주소: "+ System.identityHashCode(javaStr));
	
	
	}

}
