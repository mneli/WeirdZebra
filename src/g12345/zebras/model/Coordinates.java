package g12345.zebras.model;

/**
 *
 * @author g12345
 */
public class Coordinates {

    private final int row;
    private final int column;

    /**
     * Get the value of row
     *
     * @return the value of row
     */
    public int getRow() {
        return row;
    }

    /**
     * Get the value of column
     *
     * @return the value of column
     */
    public int getColumn() {
        return column;
    }

    /**
     * Construct an instance of Coordinates
     *
     * @param row
     * @param column
     */
    public Coordinates(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "[" + this.row + "," + this.column + "]";
    }

}
