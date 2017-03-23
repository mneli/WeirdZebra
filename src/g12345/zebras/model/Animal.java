package g12345.zebras.model;

/**
 *
 * @author g12345
 */
public class Animal {

    private final Species species;
    private final Color color;

    /**
     * Get the value of species
     *
     * @return the value of species
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Construct an instance of Animal
     *
     * @param species
     * @param color
     */
    public Animal(Species species, Color color) {
        this.species = species;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.species + " " + this.color;
    }

}
