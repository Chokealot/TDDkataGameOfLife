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

    public void createEmptyGrid() {
        for (int height = 0; height < gridHeight; height++) {
            for (int width = 0; width < gridWidth; width++) {
                grid[height][width] = 0;
            }
        }
    }

    public void setSpecificNode(int height, int width) {
        if (grid[height][width] == 0) grid[height][width] = 1;
        else grid[height][width] = 0;
    }

    public void findLife() {
        for (int height = 0; height < gridHeight; height++) {
            for (int width = 0; width < gridWidth; width++) {
                int count = 0;
                for (int index1 = -1; index1 < 2; index1++) {
                    if (height + index1 >= 0 && height + index1 < gridHeight) {
                        for (int index2 = -1; index2 < 2; index2++) {
                            if (width + index2 >= 0 && width + index2 < gridWidth) {
                                if (!(height+index1 == height && index2+width == width) && grid[height + index1][width + index2] == 1)
                                    count++;
                            }
                        }
                    }
                }
                neighbours[height][width] = count;
            }
        }
    }
}