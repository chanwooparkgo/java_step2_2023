package chapter15;

public class StBufferMain {

	public static void main(String[] args) {
		
		StringBuffer buf = new StringBuffer("Nice Day");
		
		System.out.println(buf.toString());
		System.out.println(buf.length());
		//StringBuffer의 기본용량16 +추가(8)=24
		System.out.println(buf.capacity());
		//25용량을 넘어가면 허용범위(25~50)까지는무조건 -> 50;갖고있는용량
		buf.ensureCapacity(51);
		System.out.println(buf.capacity());
		buf.insert(0, "hi! ");////인덱스범위갯수확인!!!
		System.out.println(buf);
		buf.insert(12, "everyday!");
		System.out.println(buf);
		buf.delete(0, 4);
		System.out.println(buf);

	}

}
