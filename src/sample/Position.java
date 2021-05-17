package sample;

public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        if (row < 0 || row >= 30) {
            throw new IllegalArgumentException("Row invalid");
        }
        if (column < 0 || column >= 15) {
            throw new IllegalArgumentException("Column invalid");
        }
        this.row = row;
        this.column = column;
    }

    public void moveLeft() {
        this.column--;
    }

    public void moveRight() {
        this.column++;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
