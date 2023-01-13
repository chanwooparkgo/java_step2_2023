package chapter11;

public class Player {

	private PlayLevel level;//
	
	public Player() {
		level=new BeginnerLevel();//PlayLvel상속비슷개념
		level.showLevelMessage();
	}
	
	public PlayLevel getLevel() {
		return level;//player 클래스위 레벨확인용.....
	}
	
	public void upgradeLevel(PlayLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
