package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    
    @Test
    public void testWinDiagonallyAsX() {
		TicTacToe game = new TicTacToe();
		game.markLocation(1,1);
    }
    
    @Test
    public void testWinHorizontallyAsO() {
	
	
    }
	
	@Test
	public void testForceATie() {
	
	}
        
}
