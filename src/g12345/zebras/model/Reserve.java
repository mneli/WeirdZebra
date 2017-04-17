package g12345.zebras.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author g12345
 */
public class Reserve {

    private final Animal[][] animals;

    /**
     * Construct an instance of Reserve as a 5 by 6 grid
     */
    public Reserve() {
        this.animals = new Animal[5][6];
    }

    /**
     * Check if the position in the reserve is free
     *
     * @param pos
     * @return true if the position contains null
     */
    public boolean isFree(Coordinates pos) {
        return getAnimal(pos) == null;
    }

    /**
     * Put an animal in the given position
     *
     * @param animal
     * @param pos
     */
    public void put(Animal animal, Coordinates pos) {
        this.animals[pos.getRow()][pos.getColumn()] = animal;
    }

    /**
     * Get the animal from the reserve in the given position
     *
     * @param pos
     * @return null if the position is not occupied
     */
    public Animal getAnimal(Coordinates pos) {
        return this.animals[pos.getRow()][pos.getColumn()];
    }

    /**
     * Get the list of vertically and horizontally adjacent coordinates of a
     * given coordinates.
     *
     * @param position the coordinate
     * @return a list of valid adjacent coordinates
     */
    public List<Coordinates> getAdjacents(Coordinates position) {
        List<Coordinates> adjacents = new ArrayList<>();

        addAdjacent(adjacents, new Coordinates(position.getRow(), position.getColumn() - 1));
        addAdjacent(adjacents, new Coordinates(position.getRow(), position.getColumn() + 1));
        addAdjacent(adjacents, new Coordinates(position.getRow() - 1, position.getColumn()));
        addAdjacent(adjacents, new Coordinates(position.getRow() + 1, position.getColumn()));
        return adjacents;
    }

    /**
     * Check if the given coordinate is valid before adding it to the adjacents
     * list.
     *
     * @param adjacents the list of adjacent coordinates given by the
     * getAdjacents method
     * @param position the coordinate to add
     */
    private void addAdjacent(List<Coordinates> adjacents, Coordinates position) {
        if (position.getRow() >= 0
                && position.getRow() < this.animals.length
                && position.getColumn() >= 0
                && position.getColumn() < this.animals[0].length)
            adjacents.add(position);
    }

    @Override
    public String toString() {
        String reserve = "";

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[0].length; j++) {
                reserve += "[" + animals[i][j] + "] ";
            }
            reserve += "\n";
        }
        return reserve;
    }

}
