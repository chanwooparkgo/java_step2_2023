package chapter12;

public interface Remote {

	//상수
	int MAX_VOLUME=10;
	int MIN_VOLUME=1;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
