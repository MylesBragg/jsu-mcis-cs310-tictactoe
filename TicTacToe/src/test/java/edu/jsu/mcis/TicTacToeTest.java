package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    
    @Test
    public void testWinDiagonallyAsX() {
		TicTacToe game = new TicTacToe();
		game.markLocation(1,1);
		game.getLocation(1,1);
		game.markSwap();
		game.markLocation(0,1);
		game.getLocation(0,1);
		game.markSwap();
		game.markLocation(0,0);
		game.getLocation(0,0);
		game.markSwap();
		game.markLocation(0,2);
		game.getLocation(0,2);
		game.markSwap();
		game.markLocation(2,2);
		game.getLocation(2,2);
		game.getWinner();
    }
    
    @Test
    public void testWinHorizontallyAsO() {
		TicTacToe game = new TicTacToe();
		game.markLocation(1,1);
		game.getLocation(1,1);
		game.markSwap();
		game.markLocation(2,0);
		game.getLocation(2,0);
		game.markSwap();
		game.markLocation(0,0);
		game.getLocation(0,0);
		game.markSwap();
		game.markLocation(2,2);
		game.getLocation(2,2);
		game.markSwap();
		game.markLocation(0,2);
		game.getLocation(0,2);
		game.markLocation(2,1);
		game.getLocation(2,1);
		game.getWinner();
    }
	
	@Test
	public void testForceATie() {
		TicTacToe game = new TicTacToe();
		game.markLocation(1,1);
		game.getLocation(1,1);
		game.markSwap();
		game.markLocation(0,0);
		game.getLocation(0,0);
		game.markSwap();
		game.markLocation(2,0);
		game.getLocation(2,0);
		game.markSwap();
		game.markLocation(0,2);
		game.getLocation(0,2);
		game.markSwap();
		game.markLocation(0,1);
		game.getLocation(0,1);
		game.markSwap();
		game.markLocation(2,1);
		game.getLocation(2,1);
		game.markSwap();
		game.markLocation(1,2);
		game.getLocation(1,2);
		game.markSwap();
		game.markLocation(1,0);
		game.getLocation(1,0);
		game.markSwap();
		game.markLocation(2,2);
		game.getLocation(2,2);
		game.getWinner();
	}
        
}
