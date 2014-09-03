package edu.jsu.mcis;

public class TicTacToe {
	private char[][] gameBoard;
	public static final int GAMEBOARD_DIMENSION = 3;
	public static final char EMPTY_SPACE = ' ';
	
	
	public TicTacToe() {
    gameBoard = new char[GAMEBOARD_DIMENSION][GAMEBOARD_DIMENSION];
    
    for(int row = 0; row < GAMEBOARD_DIMENSION; row++) {
      for(int col = 0; col < GAMEBOARD_DIMENSION; col++) {
        gameBoard[row][col] = EMPTY_SPACE;
      }
    }
  }
	
	public void markLocation(int row, int col, char t) {
		if (gameBoard[row][col] == EMPTY_SPACE) {
			gameBoard[row][col] = t;
		}
	}
	
	public char checkLocation(int row, int col) {
		return gameBoard[row][col];
  }
	
	
	
	
}