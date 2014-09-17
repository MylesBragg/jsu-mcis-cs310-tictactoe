package edu.jsu.mcis;

public class TicTacToe {
	public gameboardStates[][] gameBoard;
	public static final int GAMEBOARD_DIMENSION = 3;
	
	public enum gameboardStates
	{
	X, O, TIE, Empty
	}
	
	public gameboardStates winner;
	public gameboardStates mark;
	
	public TicTacToe() {
    gameBoard = new gameboardStates[GAMEBOARD_DIMENSION][GAMEBOARD_DIMENSION];
    mark = gameboardStates.X;
	winner = gameboardStates.TIE;
    freshBoard();
	}
	
	public void freshBoard() {
	    for(int row = 0; row < GAMEBOARD_DIMENSION; row++) {
	        for(int col = 0; col < GAMEBOARD_DIMENSION; col++) {
	          gameBoard[row][col] = gameboardStates.Empty;
	        }
	     }
	}
	
	public void markLocation(int row, int col) {
		if (gameBoard[row][col] == gameboardStates.Empty) {
			gameBoard[row][col] = mark;
			markSwap();
		}
	}
	
	public gameboardStates getLocation(int row, int col) {
		return gameBoard[row][col];
	}
	
	
	private gameboardStates rowWinTop() {
			if (gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2]) {
				winner = gameBoard[0][0];
			}
		return winner;
	}
	
	private gameboardStates rowWinMid() {
			if (gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2]) {
				winner = gameBoard[1][0];
			}
		return winner;
	}
	
	private gameboardStates rowWinBottom() {
			if (gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2]) {
				winner = gameBoard[2][0];
			}
		return winner;
	}
	
	private gameboardStates colWinLeft() {
			if (gameBoard[0][0] == gameBoard[1][0] && gameBoard[1][0] == gameBoard[2][0]) {
				winner = gameBoard[0][0];
			}
		return winner;
	}
	
	private gameboardStates colWinMid() {
			if (gameBoard[0][1] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][1]) {
				winner = gameBoard[0][1];
			}
		return winner;
	}
	
	private gameboardStates colWinRight() {
			if (gameBoard[0][2] == gameBoard[1][2] && gameBoard[1][2] == gameBoard[2][2]) {
				winner = gameBoard[0][2];
			}
		return winner;
	}
	
	private gameboardStates diagWin() {
			if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) {
				winner = gameBoard[0][0];
			}
		return winner;
	}
	
	private gameboardStates reverseDiagWin() {
			if (gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]) {
				winner = gameBoard[0][2];
			}
		return winner;
	}
	
	public gameboardStates getWinner() {
		rowWinTop();
		rowWinMid();
		rowWinBottom();
		colWinLeft();
		colWinMid();
		colWinRight();
		diagWin();
		reverseDiagWin();
		return winner;	    
	}

    public void markSwap() {
    	if (mark == gameboardStates.X) {
    		mark = gameboardStates.O;
    	}
    	else {
        	mark = gameboardStates.X;
    	}
    }
	
	
  
}