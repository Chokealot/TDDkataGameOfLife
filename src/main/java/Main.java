public class Main {
    public static void main(String[] args) throws InterruptedException {

        Game game = new Game(10,10);
        game.initializeGrid();
        game.createRandomGame();

        while (true) {
            game.printGame();
            game.findLife();
            game.death();
            game.birth();
            Thread.sleep(1000);
            System.out.println();
        }
    }
}
