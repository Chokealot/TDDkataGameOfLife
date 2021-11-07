public class Game {

    private int gridHeight;
    private int gridWidth;

    public int[][] grid = new int[gridHeight][gridWidth];
    public int[][] neighbours = new int[gridHeight][gridWidth];

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
}
