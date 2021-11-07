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
        for (int height = 0; height < gridHeight; height++) {
            for (int width = 0; width < gridWidth; width++) {
                grid[height][width] = 0;
            }
        }
        return grid;
    }

    public void setSpecificNode(int height, int width) {
        if (grid[height][width] == 0) grid[height][width] = 1;
        else grid[height][width] = 0;
    }

    public void findLife() {
        for (int y = 0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                int count = 0;
                for (int index1 = -1; index1 < 2; index1++) {
                    if (y + index1 >= 0 && y + index1 < gridHeight) {
                        for (int index2 = -1; index2 < 2; index2++) {
                            if (x + index2 >= 0 && x + index2 < gridWidth) {
                                if (!(y+index1 == y && index2+x == x) && grid[y + index1][x + index2] == 1)
                                    count++;
                            }
                        }
                    }
                }
                neighbours[y][x] = count;
            }
        }
    }
}