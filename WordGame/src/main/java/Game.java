
public class Game {
	
	
	boolean gameWon = false;

	public boolean checkStatus(PoI treasure, Player player) {
		if ((treasure.getxCoord() == player.getxCoord()) && (treasure.getyCoord() == player.getyCoord())){
			System.out.println("You found the treasure");
			return gameWon = true;
		} else {
			return gameWon = false;
		}
	}
	
	public void gameStart() {
		
		Player player = new Player();
		PoI treasure = new PoI();
		
		player.playerStart(player);
		treasure.setLocation();
		
		while(checkStatus(treasure, player)==false) {
			player.playerInput();
			player.playerChoice(player);
			treasure.dispCompass(player, treasure);
		}
	}
}
