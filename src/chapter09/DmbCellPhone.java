package chapter09;

public class DmbCellPhone {

	public static void main(String[] args) {
		DmCellPhone dmbCellPhone = new DmCellPhone("java폰","검정",10);
		
		//CellPhone으로부터 상속받은 필드
		CellPhone cellphone = new CellPhone();
		dmbCellPhone.color="블랙";
		dmbCellPhone.model="햅틱";
		dmbCellPhone.message="문자";
		System.out.println(cellphone.color+cellphone.model+cellphone.message);
		//DmbCellPhone의 필드
		dmbCellPhone.model="vega\n";
		dmbCellPhone.color="red\n";
		System.out.println(dmbCellPhone.channel=5);
		System.out.println(dmbCellPhone.model+dmbCellPhone.color+dmbCellPhone.channel);
		//CellPhone의 메소드를 사용하여  전화통화 구현
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("\n -> 여보세요");
		dmbCellPhone.receiveVoice("\n -> 안녕");
		dmbCellPhone.sendVoice("\n -> 어엉렁러얼");
		dmbCellPhone.hangUp();
		//DmbCellPhone의 메소드를 사용하여 채널을 바꾸기
		
	}

}
