package Production;

import static org.junit.Assert.*;
import org.junit.Test;

import Production.SosBoard.GameState;

public class GeneralGameTest {
  
  @Test
  public void testCheckForWinPlaying() {
    // Create a new GeneralGame object with size 4
    GeneralGame game = new GeneralGame(4);
    // Set totalMoves to 10
    game.totalMoves = 10;
    // Call checkForWin method
    game.checkForWin();
    // Check that currentGameState is PLAYING
    assertEquals(GameState.PLAYING, SosBoard.currentGameState);
  }
  
  @Test
  public void testCheckForWinBWon() {
    // Create a new GeneralGame object with size 3
    GeneralGame game = new GeneralGame(3);
    // Set totalMoves to 9
    game.totalMoves = 9;
    // Set bluePoints to 5 and redPoints to 3
    game.bluePoints = 5;
    game.redPoints = 3;
    // Call checkForWin method
    game.checkForWin();
    // Check that currentGameState is B_WON
    assertEquals(GameState.B_WON, SosBoard.currentGameState);
  }
  
  @Test
  public void testCheckForWinRWon() {
    // Create a new GeneralGame object with size 2
    GeneralGame game = new GeneralGame(2);
    // Set totalMoves to 4
    game.totalMoves = 4;
    // Set bluePoints to 1 and redPoints to 2
    game.bluePoints = 1;
    game.redPoints = 2;
    // Call checkForWin method
    game.checkForWin();
    // Check that currentGameState is R_WON
    assertEquals(GameState.R_WON, SosBoard.currentGameState);
  }
  
  @Test
  public void testCheckForWinDraw() {
    // Create a new GeneralGame object with size 5
    GeneralGame game = new GeneralGame(5);
    // Set totalMoves to 25
    game.totalMoves = 25;
    // Set bluePoints to 8 and redPoints to 8
    game.bluePoints = 8;
    game.redPoints = 8;
    // Call checkForWin method
    game.checkForWin();
    // Check that currentGameState is DRAW
    assertEquals(GameState.DRAW, SosBoard.currentGameState);
  }
}
