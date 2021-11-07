import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game = new Game(3,3);

    @Before
    public void initGrid() {
        game.initializeGrid();
    }

    @Test
    public void initializeGridWithSpecificWidthAndHeight() {
        game.setGridHeight(7);
        game.setGridWidth(7);
        game.initializeGrid();
        assertEquals(new int[7][7], game.grid);
    }

    @Test
    public void checkIfGridIsCreated() {
        int [][] expectedGrid = new int[3][3];
        assertEquals(expectedGrid, game.createEmptyGrid());
    }

    @Test
    public void setSpecificNodeToAliveFromDead() {
        game.setSpecificNode(1,1);
        assertEquals(1, game.grid[1][1]);
    }

}
