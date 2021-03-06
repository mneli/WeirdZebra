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
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Coordinates))
            return false;

        Coordinates c = (Coordinates) o;
        return (this.row == c.row && this.column == c.column);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.row;
        hash = 43 * hash + this.column;
        return hash;
    }

    @Override
    public String toString() {
        return "[" + this.row + "," + this.column + "]";
    }

}
