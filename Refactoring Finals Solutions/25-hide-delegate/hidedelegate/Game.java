package refactoritzacions;


public class Game {
	private Player player;
	//private Die die;
	
	public Game() {
		init();
	}
	
	private void init () {
		player = new Player();

	}
	
	public int roll () {
		return player.roll();
	}
}
