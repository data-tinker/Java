package tictactoe;

public enum Winner {
    X("X wins"),
    O("O wins"),
    DRAW("Draw"),
    NOT_FINISHED("Game not finished"),
    IMPOSSIBLE("Impossible");

    private final String state;

    Winner(String state) {
        this.state = state;
    }

    public String toString() {
        return state;
    }
}
