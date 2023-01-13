package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		//vip고객
		int price=10000;
		System.out.println("-------------------vip고객-------------");
		VIPCustomer vipcs= new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "+vipprice+"원을 지불완료하였습니다.");
		System.out.println(vipcs.showCustomer());
		
		System.out.println("-------------------일반고객-------------");
		price=10000;
		Customer cs = new Customer();
		cs.calcPrice2(price);
		System.out.println(vipcs.getCustomerGrade()+"님이"+ price +"지불하셨습니다");
		
		
	}

}
