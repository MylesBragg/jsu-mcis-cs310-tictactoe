package edu.jsu.mcis;

import java.util.*;


public class TicTacToe {
	public static int row, col;
	public static Scanner scan = new Scanner(System.in);
	public static char[][] gameBoard = new char[3][3];
	public static char turn = 'X';
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				gameBoard[i][j] = '_';
			}
		}
		PrintGameBoard();
	}
	
	public static void PrintGameBoard() {
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				if (j == 0)
					System.out.print("| ");
				System.out.print(gameBoard[i][j] + " | ");
			}
		}
		System.out.println();
	}
}