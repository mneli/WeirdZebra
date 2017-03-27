package g12345.zebras.model;

/**
 *
 * @author g12345
 */
public class ImpalaJones {

    private int position;

    public ImpalaJones() {
        this.position = -1;
    }

    /**
     * Get the value of position
     *
     * @return the value of position
     */
    public int getPosition() {
        return position;
    }

    /**
     * Put Impala Jones at an initial position.
     *
     * @param nb the initial position. Must be between 0 and 21.
     */
    public void init(int nb) {
        if (nb < 0 || nb > 21) {
            throw new IllegalArgumentException("The initial position must be "
                    + "between 0 and 21");
        }
        this.position = nb;
    }

    /**
     * Moves Impala Jones around the animal park/board.
     *
     * @param distance the amount of steps Impala Jones should make
     */
    public void move(int distance) {
        this.position += distance + 21;
        this.position %= 21;
    }

    /**
     * Check if Impala Jones is at the top of the animal park/board.
     *
     * @return
     */
    public boolean isUp() {
        return this.position < 6;
    }

    /**
     * Check if Impala Jones is at the bottom of the animal park/board.
     *
     * @return
     */
    public boolean isDown() {
        return this.position > 10 && this.position < 17;
    }

    /**
     * Check if Impala Jones is at the left side of the animal park/board.
     *
     * @return
     */
    public boolean isLeft() {
        return this.position > 16;
    }

    /**
     * Check if Impala Jones is at the right side of the animal park/board.
     *
     * @return
     */
    public boolean isRight() {
        return this.position > 5 && this.position < 11;
    }

    /**
     * Get the column number of the animal park/board where Impala Jones is.
     *
     * @return -1 if Impala Jones is at the left or right border of the board.
     */
    public int getColumn() {
        if (isLeft() || isRight())
            return -1;
        if (isUp())
            return this.position;
        return 16 - this.position;
    }

    /**
     * Get the row number of the animal park/board where Impala Jones is.
     *
     * @return -1 if Impala Jones is at the top or bottom border of the board.
     */
    public int getRow() {
        if (isUp() || isDown())
            return -1;
        if (isRight())
            return this.position % 6;
        return 21 - this.position;
    }

    /**
     * Check if the movement of Impala Jones is permitted. A movement is
     * permitted only if the row or the column in front of which Impala Jones
     * stands after the movement has at least one free spot.
     *
     * @param reserve
     * @param distance must be positive
     * @return
     */
    public boolean checkMove(Reserve reserve, int distance) {
        int row, column;
        move(distance);

        if (getColumn() == -1) {
            row = getRow();
            column = 0;
            while (column < 6 && !reserve.isFree(new Coordinates(row, column))) {
                column++;
            }
            move(-distance);
            return column < 6;
        }

        row = 0;
        column = getColumn();
        while (row < 5 && !reserve.isFree(new Coordinates(row, column))) {
            row++;
        }
        move(-distance);
        return row < 5;
    }

    /**
     * Check if the position choose by the player to put his animal is a valid
     * coordinate.
     *
     * @param pos
     * @return
     */
    public boolean valid(Coordinates pos) {
        return getColumn() == -1 ? pos.getRow() == getRow() : pos.getColumn() == getColumn();
    }

    /**
     * Return the smallest movement possible for Impala Jones.
     *
     * @param reserve
     * @return -1 if no more moves possible for Impala Jones.
     */
    public int findFirst(Reserve reserve) {
        int distance = 1;
        while (distance < 22 && !checkMove(reserve, distance)) {
            distance++;
        }
        return distance == 22 ? -1 : distance;
    }
}
