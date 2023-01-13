package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		
		System.out.println("=====곰===========");
		Bear bear = new Bear();
		System.out.println("눈은"+bear.getEye());
		System.out.println("다리는"+bear.getLeg());
		System.out.println(bear.woong);
		
		System.out.println(bear);
		
		System.out.println("=====사자===========");
		Lion lion = new Lion();
		System.out.println("눈은"+lion.getEye());
		System.out.println("다리는"+lion.getLeg());
		System.out.println(lion.galgi);
		
		
		System.out.println("=====거미===========");
		Spider spider = new Spider();
		
		System.out.println("거미눈과다리는"+ spider.getEye());
		System.out.println("거미눈과다리는"+ spider.getLeg());
		System.out.println("거미눈과다리는"+ spider.web);
	}

}
