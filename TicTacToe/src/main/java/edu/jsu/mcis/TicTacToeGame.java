package edu.jsu.mcis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeGame extends JFrame implements ActionListener{
	private TicTacToe theory;
	JPanel panel;
	JButton[][] square;

	
	
	public TicTacToeGame(){
		
		theory = new TicTacToe();
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		this.add(panel);
		square = new JButton[3][3];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++) {
			square[i][j] = new JButton();
			square[i][j].setName("Location" + i + j);
			square[i][j].addActionListener(this);
			panel.add(square[i][j]);
		}
	}
			this.pack();
			this.setTitle("Tic Tac Toe");
			this.setSize(450, 450);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(square[i][j] == (JButton) e.getSource()){
						theory.markLocation(i,j);
						String player = placeMark(i,j);
						square[i][j].setText(player);
						square[i][j].setEnabled(false);
				}
			}
		}
		if(theory.getWinner() != TicTacToe.gameboardStates.TIE) {
			(new Thread(new Runnable () {
			public void run() {JOptionPane displayResult = new JOptionPane();
				displayResult.showMessageDialog(null, "The winner is " + theory.getWinner(), "Game Over", 0);
				}})).start();
		}
		else if (theory.getWinner() == TicTacToe.gameboardStates.TIE && theory.count >= 8) {
			(new Thread(new Runnable () {
				public void run() {JOptionPane displayResult = new JOptionPane();
					displayResult.showMessageDialog(null, "The winner is " + theory.getWinner(), "Game Over", 0);
					}})).start();
		}
	}
	
	public String placeMark(int row, int col)
	{
		return theory.getLocation(row,col).toString();
	}
	

	public static void main(String[] args){
	TicTacToeGame gui = new TicTacToeGame();
	}
}