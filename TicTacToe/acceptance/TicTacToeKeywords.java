import edu.jsu.mcis.*;

public class TicTacToeKeywords {
    private TicTacToe game;
	 private TicTacToeGame gui;
	
	public void startNewGame() {
		game = new TicTacToe();
		startApplication();
	}
	public void startApplication() {
		gui = new TicTacToeGame();
	}
	public void markLocation(int row, int col) {
		game.markLocation(row,col);
	}
	
	public void checkLocation(int row, int col, char mark) {
		String loc = getLocation(row,col);
	}
	
	public String getLocation(int row, int col) {
		return game.getLocation(row,col).toString();
	}
	
	public String winnerShouldBe(){
		return game.getWinner().toString();
	}	
	
	
	
	
}
