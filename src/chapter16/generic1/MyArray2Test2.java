package chapter16.generic1;



 class MyArray2G<E> {
	 //구체적인타입없이 객체처럼 사용하기위해 객체 생성시 구체적인 매개변수있음
	
	private Object[] array = new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public E get(int index) {
		return (E)array[index];
	}

	public static void main(String[] args) {
		MyArray2G<String> myArray1 = new MyArray2G<>();
		myArray1.add(new String("test"));
		String str=myArray1.get(0);//다운캐스팅
		System.out.println(str);
		
		MyArray2G<Integer> myArray2 = new MyArray2G<>();
		myArray2.add(new Integer(100));
		Integer num=(Integer)myArray2.get(0);//다운캐스팅
		System.out.println(num);

	}

}
