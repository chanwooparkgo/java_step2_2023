package chapter09;

public class CellPhone {

	String model;
	String color;
	String message;
	
	void powerOn() {System.out.println("전원을켭니다"); }
	void powerOff() {System.out.println("전원을끕니다"); }
	void bell() {System.out.println("벨이올립니다"); }
	void sendVoice(String message) {System.out.println("자기자신"+ message); }
	void receiveVoice(String message) {System.out.println("상대방"+ message); }
	void hangUp() {System.out.println("전원을켭니다"); }
	
	
}