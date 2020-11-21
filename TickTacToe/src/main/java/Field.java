package tictactoe;
import java.util.*;

public class Field {
    private final int fieldSize;
    private final Cell[][] field;
    private final Scanner scanner;

    public Field(int fieldSize) {
        this.fieldSize = fieldSize;
        field = new Cell[fieldSize][fieldSize];
        init();
        scanner = new Scanner(System.in);
    }

    public void init() {
        for (int i = 0; i < fieldSize; ++i) {
            for (int j = 0; j < fieldSize; ++j) {
                field[i][j] = Cell.NONE;
            }
        }
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); ++i) {
            char cell = input.charAt(i);

            if (cell == 'X') {
                field[i / fieldSize][i % fieldSize] = Cell.X;
            } else if (cell == 'O') {
                field[i / fieldSize][i % fieldSize] = Cell.O;
            } else {
                field[i / fieldSize][i % fieldSize] = Cell.NONE;
            }
        }
    }

    public void print() {
        System.out.println("---------");
        char cell;

        for (int i = 0; i < fieldSize; ++i) {
            System.out.print("| ");
            for (int j = 0; j < fieldSize; ++j) {
                if (field[i][j] == Cell.X) {
                    cell = 'X';
                } else if (field[i][j] == Cell.O) {
                    cell = 'O';
                } else {
                    cell = ' ';
                }
                System.out.print(cell + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public Winner nextTurn(Cell cell) {
        boolean goodInput = false;
        int column;
        int row;

        while (!goodInput) {
            System.out.println("Enter the coordinates: ");

            if (scanner.hasNextInt()) {
                column = scanner.nextInt();
            } else {
                scanner.next();
                scanner.next();
                System.out.println("You should enter numbers!");
                continue;
            }

            if (scanner.hasNextInt()) {
                row = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("You should enter numbers!");
                continue;
            }

            if (column < 1 || column > 3 || row < 1 || row > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            column = column - 1;
            row = 3 - row;

            if (field[row][column] != Cell.NONE) {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            field[row][column] = cell;

            goodInput = true;
        }

        return getWinner();
    }

    private Winner getWinner() {
        Cell[][] rows = new Cell[2 * fieldSize + 2][fieldSize];

        int countCellsX = getCellsCount(Cell.X);
        int countCellsO = getCellsCount(Cell.O);

        int countWinsX = 0;
        int countWinsO = 0;

        int idx = 0;
        Cell[] diag1 = new Cell[fieldSize];
        Cell[] diag2 = new Cell[fieldSize];
        for (int i = 0; i < fieldSize; ++i) {
            diag1[i] = field[i][i];
            diag2[i] = field[fieldSize - i - 1][i];

            Cell[] row = new Cell[fieldSize];
            Cell[] col = new Cell[fieldSize];

            for (int j = 0; j < fieldSize; ++j) {
                row[j] = field[i][j];
                col[j] = field[j][i];
            }

            rows[idx++] = row;
            rows[idx++] = col;
        }

        rows[idx++] = diag1;
        rows[idx] = diag2;

        for (Cell[] row: rows) {
            Winner winner = getRowWinner(row);
            if (winner == Winner.X) {
                ++countWinsX;
            } else if (winner == Winner.O) {
                ++countWinsO;
            }
        }

        if (countWinsO > 0 && countWinsX > 0 || Math.abs(countCellsX - countCellsO) > 1) {
            return Winner.IMPOSSIBLE;
        } else if (countWinsO == 0 && countWinsX == 0) {
            if (countCellsO + countCellsX == fieldSize * fieldSize) {
                return Winner.DRAW;
            }
            return Winner.NOT_FINISHED;
        } else if (countWinsO >= 1) {
            return Winner.O;
        }

        return Winner.X;
    }

    private int getCellsCount(Cell cell) {
        int count = 0;
        for (int i = 0; i < fieldSize; ++i) {
            for (int j = 0; j < fieldSize; ++j) {
                if (field[i][j] == cell) {
                    ++count;
                }
            }
        }

        return count;
    }

    private Winner getRowWinner(Cell[] row) {
        int countX = 0;
        int countO = 0;

        for (Cell cell : row) {
            if (cell == Cell.X) {
                ++countX;
            } else if (cell == Cell.O) {
                ++countO;
            }
        }

        if (countX == fieldSize) {
            return Winner.X;
        } else if (countO == fieldSize) {
            return Winner.O;
        }

        return Winner.DRAW;
    }
}
