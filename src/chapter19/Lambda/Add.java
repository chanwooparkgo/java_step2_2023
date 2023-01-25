package chapter19.Lambda;


@FunctionalInterface
public interface Add {
	//@FunctionalInterface 인터페이스로 구현하된 추상메소드는 하나만 존재할수있음
	public int add(int x, int y) ;
	
	
	
	
	
	
	/*public default int sub(int n1, int n2) {
		
		return 0;
	} */
}
