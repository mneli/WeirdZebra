package g12345.zebras.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author g12345
 */
public class Pieces {

    private final List<Animal> animals;

    /**
     * Construct an instance of Pieces
     */
    public Pieces() {

        this.animals = new ArrayList<>();

        addAnimal(Species.GAZELLE, 6);
        addAnimal(Species.ZEBRA, 5);
        addAnimal(Species.CROCODILE, 2);
        addAnimal(Species.LION, 1);
        addAnimal(Species.ELEPHANT, 1);

    }

    /**
     * Add animal to the stock with given parameters. Called from the
     * constructor to populate the stock
     *
     * @param species
     * @param qte quantity of animal to add
     */
    private void addAnimal(Species species, int qte) {
        int i = 0;
        while (i < qte) {
            this.animals.add(new Animal(species, Color.GREEN));
            this.animals.add(new Animal(species, Color.RED));
            i++;
        }
    }

    /**
     * Get the animal from stock with the given parameters. The animal is
     * removed from the stock
     *
     * @param color
     * @param species
     * @return an animal
     */
    public Animal getAnimal(Species species, Color color) {
        int index = this.animals.indexOf(new Animal(species, color));
        return index == -1 ? null : this.animals.remove(index);
    }

    /**
     * Put back an animal inside the stock changing it's state to REST
     *
     * @param animal the animal to put back
     */
    public void putBackAnimal(Animal animal) {
        if (animal != null) {
            animal.setState(AnimalState.REST);
            this.animals.add(animal);
        }
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
     * Check if there's any animal left of the color given in parameter in
     * stock.
     *
     * @param color
     * @return
     */
    public boolean hasAvailable(Color color) {
        int index = 0;
        int listSize = this.animals.size();
        while (index < listSize && this.animals.get(index).getColor() != color) {
            index++;
        }
        return index < listSize;
    }

    /**
     * Gives the quantity of animal left in the stock which matches the color
     * and the species given in parameter
     *
     * @param color
     * @param species
     * @return the number of animal matching the parameters
     */
    public int getNbAnimals(Species species, Color color) {
        int nbOfAnimal = 0;
        Animal animalToFind = new Animal(species, color);

        for (Animal animal : animals) {
            if (animalToFind.equals(animal))
                nbOfAnimal++;
        }
        return nbOfAnimal;
    }

}
