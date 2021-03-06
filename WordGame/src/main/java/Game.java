
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
		treasure.setTreasureLoc();
		
		while(checkStatus(treasure, player)==false) {
			player.playerInput();
			this.validPos(player);
			player.playerChoice(player);
			treasure.dispCompass(player, treasure);
		}
	}
	
	public void validPos(Player player) {
		if(player.getxCoord()>10){
			player.setxCoord(10);
			System.out.println("There is nothing further east, you turn back");
		} 
		else if(player.getxCoord()<0) {
			player.setxCoord(0);
			System.out.println("There is nothing further west, you turn back");
		}
		else if(player.getyCoord()>10) {
			player.setyCoord(10);
			System.out.println("There is nothing further north, you turn back");
		}
		else if(player.getyCoord()<0) {
			player.setyCoord(0);
			System.out.println("There is nothing further south, you turn back");
		}
	}
}
