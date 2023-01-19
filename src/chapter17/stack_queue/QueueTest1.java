package chapter17.stack_queue;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len=arrayQueue.size();
		
		if(len == 0) {
			System.out.println("큐가 비어있습니다");
			return null;
		}//if
		return(arrayQueue.remove(0));
	}//deQueue
}



public class QueueTest1 {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());//인덱스번호 자동하향
		System.out.println(queue.deQueue());//인덱스번호 자동하향
		System.out.println(queue.deQueue());//인덱스번호 자동하향
	}
}


