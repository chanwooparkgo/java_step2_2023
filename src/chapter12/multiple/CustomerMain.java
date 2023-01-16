package chapter12.multiple;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println("-------Buy-----------");
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();

		System.out.println("-------Buy-----------");
		//customer.buy();
		Sell seller = customer;
		seller.sell();
		//seller.order();
		//seller.sellorder();
		//seller 부모 / Customer 자식
		if (seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			System.out.println("--down chasting");//부모클래스와자식클래스가 뒤바뀐]
			customer2.buy();
			customer2.sell();
			customer2.sellorder();
		}
		
		customer.order();
		
		
		
		
	}

}
