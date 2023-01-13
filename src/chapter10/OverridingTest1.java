package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {
		
		Customer customerLee= new Customer(10001,"이순신");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomer());
		
		VIPCustomer customerkim=new VIPCustomer(10002, "김유신",1004);
		customerkim.bonusPoint=1000;
		System.out.println(customerkim.showCustomer());
		System.out.println(customerLee.getCustomerName() + "님이 " + customerLee.calcPrice(10000) + "원을 지불 완료하였습니다.");
		System.out.println(customerLee.getCustomerName() + "님이 " + customerLee.calcPrice(10000) + "원을 지불 완료하였습니다.");
		

	}

}
