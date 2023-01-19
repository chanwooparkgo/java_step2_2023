package chapter17.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue= new LinkedList<Message>();
		//offer -> 큐입력
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "김유신"));
		messageQueue.offer(new Message("sendkakaotalk", "이순신"));

		//poll: 출력
		while( !messageQueue.isEmpty()) {
			Message message= messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to+"님에게 메일을 보냅니다");
				break;
			case "sendSms":
				System.out.println(message.to+"님에게 문자를보냅니다");
				break;
			case "sendkakaotalk":
				System.out.println(message.to+"님에게 카톡을보냅니다");
				break;
			default:
				break;
			}
		}//while
	}//main

}
