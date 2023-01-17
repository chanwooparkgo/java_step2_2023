package chapter14.hashcode;

public class Key {

	public int number;
	public int name;
	public int addr;
	
	public Key (int number) {
		this.number=number;
	}
	
	//물리적주소
	@Override
	public int hashCode() {
		
		//return super.hashCode();//원래 heap메모리  16진수 주소
		return number;//원래 heap메모리  16진수 주소
	}
	
//논리적값(데이터)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey =(Key)obj;//object객체는 아래로부터상승은 다운캐스팅
			if(this.number==compareKey.number) {
				return true;//값 일치
			}
		}
		return false;
	}
	
	
}
