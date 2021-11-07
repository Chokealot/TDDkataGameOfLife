import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void checkIfGridIsCreated() {
        int [][] expectedGrid = new int[3][3];
        assertEquals(expectedGrid, game.createEmptyGrid());
    }

}
