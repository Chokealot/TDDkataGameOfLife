import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game = new Game(3,3);

    @Test
    public void checkIfGridIsCreated() {
        int [][] expectedGrid = new int[3][3];
        assertEquals(expectedGrid, game.createEmptyGrid());
    }

    @Test
    public void initializeGridWithSpecificWidthAndHeight() {
        game.setGridHeight(3);
        game.setGridWidth(3);
        game.initializeGrid();
        int[][] testGrid = new int[3][3];
        assertEquals(testGrid, game.grid);
    }

}
