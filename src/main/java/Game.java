public class Game {

    private int gridHeight;
    private int gridWidth;

    public int[][] grid;
    public int[][] neighbours;

    public Game(int gridHeight, int gridWidth) {
        this.gridHeight = gridHeight;
        this.gridWidth = gridWidth;
    }

    public int getGridHeight() {
        return gridHeight;
    }

    public void setGridHeight(int gridHeight) {
        this.gridHeight = gridHeight;
    }

    public int getGridWidth() {
        return gridWidth;
    }

    public void setGridWidth(int gridWidth) {
        this.gridWidth = gridWidth;
    }

    public void initializeGrid() {
        grid = new int[gridHeight][gridWidth];
        neighbours = new int[gridHeight][gridWidth];
    }

    public int[][] createEmptyGrid() {
        for (int height=0; height < gridHeight; height++) {
            for (int width = 0; width < gridWidth; width++) {
                grid[height][width] = 0;
            }
        }
        return grid;
    }
}
