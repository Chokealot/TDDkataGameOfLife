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
        assertEquals(7,game.getGridHeight());
        assertEquals(7, game.getGridWidth());
    }

    @Test
    public void checkIfGridIsCreated() {
        int [][] expectedGrid = {{0,0,0},{0,0,0},{0,0,0}};
        game.createEmptyGrid();
        assertEquals(expectedGrid, game.grid);
    }

    @Test
    public void setSpecificNodeToAliveFromDead() {
        game.setSpecificNode(1,1);
        assertEquals(1, game.grid[1][1]);
    }

    @Test
    public void findNeighboursAndCountHowManyEachCellHasAndShouldBeTwo() {
        setTestGridWithThreeAliveCellsInARow();
        game.findLife();
        assertEquals(2, game.neighbours[0][1]);
        game.setSpecificNode(1,1);
        game.findLife();
        assertEquals(3, game.neighbours[0][1]);
    }

    @Test
    public void testToSeeIfADeadCellWithThreeNeighboursWillStartToLive() {
        setTestGridWithThreeAliveCellsInARow();
        game.findLife();
        game.birth();
        assertEquals(1, game.grid[1][1]);
    }

    @Test
    public void testToSeeIfACellWithLessThanTwoNeighboursDiesDueToUnderpopulation() {
        setTestGridWithThreeAliveCellsInARow();
        game.death();
        assertEquals(0, game.grid[0][2]);
    }

    @Test
    public void testToSeeIfACellWithMoreThanThreeNeighboursDiesDueToOverpopulation() {
        setTestGridWithThreeAliveCellsInARow();
        game.setSpecificNode(1,0);
        game.setSpecificNode(1,1);
        game.death();
        assertEquals(0,game.grid[1][1]);
    }

    public void setTestGridWithThreeAliveCellsInARow() {
        game.setSpecificNode(0,0);
        game.setSpecificNode(0,1);
        game.setSpecificNode(0,2);
    }
}
