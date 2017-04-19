package g12345.zebras.model;

import java.util.Objects;

/**
 *
 * @author g12345
 */
public class Animal {

    private final Species species;
    private final Color color;
    private AnimalState state;

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
     * Get the value of state
     *
     * @return the value of state
     */
    public AnimalState getState() {
        return state;
    }

    /**
     * Set the value of state
     *
     * @param state new value of state
     */
    public void setState(AnimalState state) {
        this.state = state;
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
        this.state = AnimalState.REST;
    }

    public void action(Animal other) {
        switch (this.species) {
            case LION:
                switch (other.species) {
                    case GAZELLE:
                        other.setState(AnimalState.RUN);
                        //the player have to take back the other gazelle
                        break;
                    case ZEBRA:
                        other.setState(AnimalState.HIDDEN);
                        break;
                    default:
                }
                break;
            case ZEBRA:
            case GAZELLE:
                switch (other.species) {
                    case LION:
                        this.state = AnimalState.HIDDEN;
                        break;
                    default:
                }
                break;
            case CROCODILE:
                //TODO
                break;
            default:
        }
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
