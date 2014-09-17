package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    
	@Test
	public void testMarkLocation() {
	TicTacToe game = new TicTacToe();
	game.markLocation(0,0);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,0));
	}

    
    @Test
    public void testRowWinTopAsX() {
	TicTacToe game = new TicTacToe();
	game.markLocation(0,0);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,0));
	game.markLocation(1,1);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(1,1));
	game.markLocation(0,1);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,1));
	game.markLocation(2,1);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(2,1));
	game.markLocation(0,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,2));
	assertEquals(TicTacToe.gameboardStates.X,game.getWinner());
    }
	
	@Test
	public void testRowWinMidAsO() {
	TicTacToe game = new TicTacToe();
	game.markLocation(0,0);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,0));
	game.markLocation(1,0);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(1,0));
	game.markLocation(0,1);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,1));
	game.markLocation(1,1);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(1,1));
	game.markLocation(2,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(2,2));
	game.markLocation(1,2);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(1,2));
	assertEquals(TicTacToe.gameboardStates.O,game.getWinner());
	}
	
	@Test
	public void testRowWinBottomAsX() {
	TicTacToe game = new TicTacToe();
	game.markLocation(2,0);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(2,0));
	game.markLocation(0,1);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(0,1));
	game.markLocation(2,1);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(2,1));
	game.markLocation(0,0);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(0,0));
	game.markLocation(2,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(2,2));
	assertEquals(TicTacToe.gameboardStates.X,game.getWinner());
	}
	
	@Test
	public void testColWinLeftAsO() {
	TicTacToe game = new TicTacToe();
	game.markLocation(0,1);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,1));
	game.markLocation(0,0);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(0,0));
	game.markLocation(1,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(1,2));
	game.markLocation(1,0);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(1,0));
	game.markLocation(2,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(2,2));
	game.markLocation(2,0);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(2,0));
	assertEquals(TicTacToe.gameboardStates.O,game.getWinner());
	}
	
	@Test
	public void testColWinMidAsO() {
	TicTacToe game = new TicTacToe();
	game.markLocation(0,0);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,0));
	game.markLocation(0,1);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(0,1));
	game.markLocation(0,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,2));
	game.markLocation(1,1);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(1,1));
	game.markLocation(2,0);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(2,0));
	game.markLocation(2,1);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(2,1));
	assertEquals(TicTacToe.gameboardStates.O,game.getWinner());
	}
	
	@Test
	public void testColWinRightAsX() {
	TicTacToe game = new TicTacToe();
	game.markLocation(0,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,2));
	game.markLocation(0,1);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(0,1));
	game.markLocation(1,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(1,2));
	game.markLocation(2,0);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(2,0));
	game.markLocation(2,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(2,2));
	assertEquals(TicTacToe.gameboardStates.X,game.getWinner());
	}
	
	@Test
	public void testDiagWinAsX() {
	TicTacToe game = new TicTacToe();
	game.markLocation(0,0);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,0));
	game.markLocation(1,0);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(1,0));
	game.markLocation(1,1);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(1,1));
	game.markLocation(0,2);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(0,2));
	game.markLocation(2,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(2,2));
	assertEquals(TicTacToe.gameboardStates.X,game.getWinner());
	}
	
	@Test
	public void testReverseDiagWinAsO() {
	TicTacToe game = new TicTacToe();
	game.markLocation(0,0);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(0,0));
	game.markLocation(0,2);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(0,2));
	game.markLocation(1,0);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(1,0));
	game.markLocation(1,1);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(1,1));
	game.markLocation(2,2);
	assertEquals(TicTacToe.gameboardStates.X, game.getLocation(2,2));
	game.markLocation(2,0);
	assertEquals(TicTacToe.gameboardStates.O, game.getLocation(2,0));
	assertEquals(TicTacToe.gameboardStates.O,game.getWinner());
	}
        
}
