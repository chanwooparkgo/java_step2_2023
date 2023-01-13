package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		//기본게임1단계
		Player player = new Player();
		player.play(1);
		//레벨2단계
		AdvancedLevel2 aLevel =new AdvancedLevel2();
		player.upgradeLevel(aLevel);
		player.play(2);
		//레벨3단계
		SuperLevel superLevel =new SuperLevel();
		player.upgradeLevel(aLevel);
		player.play(3);
	}

}
