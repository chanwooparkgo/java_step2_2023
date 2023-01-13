package chapter09;

public class DmCellPhone extends CellPhone {

	int channel;
	
	public DmCellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널"+ channel+"번 dmb방송수신을 시작합니다");
	}
	
	void changeDmb() {
		this.channel=channel;
		System.out.println("채널"+ channel+"번으로바꿉니다");
	}
	
	void turnOffDmb() {
		System.out.println("채널"+ channel+"번 dmb방송수신을 시작합니다");
	}
}
