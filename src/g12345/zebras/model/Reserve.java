package g12345.zebras.model;

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
