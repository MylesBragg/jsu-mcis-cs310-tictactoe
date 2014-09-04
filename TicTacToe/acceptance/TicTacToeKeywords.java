import edu.jsu.mcis.*;

public class TicTacToeKeywords {
    private TicTacToe game;
	
	public void startNewGame() {
		game = new TicTacToe();
	}
	
	public void markLocation(int row, int col) {
		game.markLocation(row,col);
		game.markSwap();
	}
	
	public void checkLocation(int row, int col, char mark) {
		String loc = getLocation(row,col);
	}
	
	public String getLocation(int row, int col) {
		return game.getLocation(row,col);
	}
	
	public void winnerShouldBe(char winner)	{
		String result = getWinner();
	}
	
	public String getWinner() {
		if (game.winCondition() == true) {
		game.markSwap();
		char temp = game.mark;
		return Character.toString(temp);
		}
	return "TIE";
	}
}
