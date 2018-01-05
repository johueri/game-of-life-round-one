import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTests {

	Board ourBoard;
	
	@Test
	public void boardInstantiation() {
	 Board ourBoard = new Board();
	 assertNotNull(ourBoard);
	}
	
	@Test
	public void boardHasTwoDimensionalArray () {
		Board ourBoard = new Board();
		boolean[][] returnBoard = ourBoard.getBoard();
		assertNotNull(returnBoard);
	}

	@Before 
	public void setup () {
	ourBoard = new Board();
		
	}

}
