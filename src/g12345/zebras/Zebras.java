package g12345.zebras;

import g12345.zebras.model.Animal;
import g12345.zebras.model.Color;
import g12345.zebras.model.Coordinates;
import g12345.zebras.model.Reserve;
import g12345.zebras.model.Species;

/**
 *
 * @author g12345
 *
 */
public class Zebras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal(Species.GAZELLE, Color.RED);
        Coordinates pos = new Coordinates(2, 4);
        Reserve reserve = new Reserve();
        reserve.put(animal, pos);
        System.out.println(reserve);
    }
}
