package g12345.zebras.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Animal))
            return false;

        Animal a = (Animal) o;
        return (this.species == a.species && this.color == a.color);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.species);
        hash = 41 * hash + Objects.hashCode(this.color);
        return hash;
    }

}
