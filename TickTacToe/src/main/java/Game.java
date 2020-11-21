package tictactoe;

public class Game {
    private final Field field;
    private Cell cell;
    private Winner winner;

    public Game(int fieldSize) {
        field = new Field(fieldSize);
        cell = Cell.X;
        winner = Winner.NOT_FINISHED;
    }

    public Winner play() {
        field.print();

        while (winner == Winner.NOT_FINISHED) {
            winner = field.nextTurn(cell);
            nextPlayer();
            field.print();
        }

        return winner;
    }

    private void nextPlayer() {
        if (cell == Cell.X) {
            cell = Cell.O;
        } else {
            cell = Cell.X;
        }
    }
}
