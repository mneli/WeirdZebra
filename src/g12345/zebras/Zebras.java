package g12345.zebras;

import g12345.zebras.model.Animal;
import g12345.zebras.model.Color;
import g12345.zebras.model.Coordinates;
import g12345.zebras.model.Pieces;
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
        /*
        Animal animal = new Animal(Species.GAZELLE, Color.RED);
        Coordinates pos = new Coordinates(2, 4);
        Reserve reserve = new Reserve();
        reserve.put(animal, pos);
        System.out.println(reserve);
         */

        Reserve reserve = new Reserve();
        Pieces stock = new Pieces();
        Animal gazelleGreen = stock.getAnimal(Species.GAZELLE, Color.GREEN);
        Animal crocoRed = stock.getAnimal(Species.CROCODILE, Color.RED);
        Coordinates gazelleGreenPos = new Coordinates(2, 4);
        Coordinates crocoRedPos = new Coordinates(4, 2);
        reserve.put(gazelleGreen, gazelleGreenPos);
        reserve.put(crocoRed, crocoRedPos);
        System.out.println(reserve);
    }
}
