package g12345.zebras.model;

import java.util.List;

/**
 *
 * @author g12345
 */
public class Pieces {

    private List<Animal> animals;

    /**
     * Construct an instance of Pieces
     */
    public Pieces() {

        addAnimal(Species.GAZELLE, Color.RED, 6);
        addAnimal(Species.GAZELLE, Color.GREEN, 6);
        addAnimal(Species.ZEBRA, Color.RED, 5);
        addAnimal(Species.ZEBRA, Color.GREEN, 5);
        addAnimal(Species.CROCODILE, Color.RED, 2);
        addAnimal(Species.CROCODILE, Color.GREEN, 2);
        addAnimal(Species.LION, Color.RED, 1);
        addAnimal(Species.LION, Color.GREEN, 1);
        addAnimal(Species.ELEPHANT, Color.RED, 1);
        addAnimal(Species.ELEPHANT, Color.GREEN, 1);

    }

    /**
     * Add animal to the stock with given parameters. Called from the
     * constructor to populate the stock
     *
     * @param species
     * @param color
     * @param qte quantity of animal to add
     */
    private void addAnimal(Species species, Color color, int qte) {
        int i = 0;
        while (i < qte) {
            this.animals.add(new Animal(species, color));
            i++;
        }
    }

    /**
     * Get the animal from stock with the given parameters. The animal is
     * removed from the stock
     *
     * @param color
     * @param species
     * @return
     */
    public Animal getAnimal(Color color, Species species) {
        //this.animals.remove(this.animals.indexOf(new Animal(species, color)));
        return null;
    }

    /**
     * Check if there's any animal left in stock.
     *
     * @return true if the stock is not empty
     */
    public boolean hasAvailable() {
        return !this.animals.isEmpty();
    }

    /**
     * Gives the quantity of animal left in the stock which matches the color
     * and the species given in parameter
     *
     * @param color
     * @param species
     * @return
     */
    public int getNbAnimals(Color color, Species species) {
        return 0;
    }

}
