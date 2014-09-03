import edu.jsu.mcis.*;

public class TicTacToeKeywords {
    private TicTacToe game;
	
	public void startNewGame() {
		game = new TicTacToe();
	}
	
	public void markLocation(int row, int col) {
		game.markLocation(row,col,'X');
	}
		
	
	
	

}