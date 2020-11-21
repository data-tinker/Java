package tictactoe;

public class Main {
    private final static int FIELD_SIZE = 3;

    public static void main(String[] args) {
        Game game = new Game(FIELD_SIZE);
        Winner winner = game.play();
        System.out.println(winner);
    }
}
