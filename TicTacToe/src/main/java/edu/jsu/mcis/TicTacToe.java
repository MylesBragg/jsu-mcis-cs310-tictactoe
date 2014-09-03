package edu.jsu.mcis;

public class TicTacToe {
	public char[][] gameBoard = new char[3][3];
	
	
	public void markLocation(int row, int col) {
		gameBoard[row][col] = 'X';
	}
	
	}