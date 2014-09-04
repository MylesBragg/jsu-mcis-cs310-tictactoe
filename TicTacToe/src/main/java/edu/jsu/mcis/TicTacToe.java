package edu.jsu.mcis;

public class TicTacToe {
	private char[][] gameBoard;
	public char mark;
	public static final int GAMEBOARD_DIMENSION = 3;
	public static final char EMPTY_SPACE = ' ';
	
	
	public TicTacToe() {
    gameBoard = new char[GAMEBOARD_DIMENSION][GAMEBOARD_DIMENSION];
    mark = 'X';
    freshBoard();
	}
	
	public void freshBoard() {
	    for(int row = 0; row < GAMEBOARD_DIMENSION; row++) {
	        for(int col = 0; col < GAMEBOARD_DIMENSION; col++) {
	          gameBoard[row][col] = EMPTY_SPACE;
	        }
	     }
	}
	
	public void markLocation(int row, int col) {
		if (gameBoard[row][col] == EMPTY_SPACE) {
			gameBoard[row][col] = mark;
		}
	}
	
	public String getLocation(int row, int col) {
		return Character.toString(gameBoard[row][col]);
	}
	
	   
	private boolean markCheck(char a, char b, char c) {
		  	return ((a != ' ') && (a == b) && (b == c));
	}
	
	private boolean rowWin() {
		for (int row = 0; row < 3; row++) {
			if (markCheck(gameBoard[row][0], gameBoard[row][1], gameBoard[row][2]) == true) {
				return true;
			}
		}
		return false;
	}
	
	private boolean diagonalWin() {
		 return ((markCheck(gameBoard[0][0], gameBoard[1][1], gameBoard[2][2]) == true) || (markCheck(gameBoard[0][2], gameBoard[1][1], gameBoard[2][0]) == true));
	}
	
	
	public boolean winCondition() {
		return (rowWin() || diagonalWin());	    
	}
	

    public void markSwap() {
    	if (mark == 'X') {
    		mark = 'O';
    	}
    	else {
        	mark = 'X';
    	}
    }
  
    
    public String getWinner() {
		if (winCondition() == true) {
			markSwap();
			char temp = mark;
			return Character.toString(temp);
    }
	return "TIE";
    }
}
