package Production;


import org.junit.Test;
import static org.junit.Assert.*;

public class SosBoardTest {

    // Test that makeAiMove() actually makes a move
    @Test
    public void testMakeAiMove() {
        SosBoard board = new GeneralGame(3);
        board.initBoard();
        int totalMovesBefore = board.totalMoves;
        board.makeAiMove();
        int totalMovesAfter = board.totalMoves;
        assertEquals(totalMovesBefore + 1, totalMovesAfter);
    }
}


