package chapter17.stack_queue;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(200));
		coinBox.push(new Coin(300));
		coinBox.push(new Coin(400));
		
		
		System.out.println(!coinBox.isEmpty());
		while( !coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온동전:"+coin.getValue());
		}

	}

}
