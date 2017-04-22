package g12345.zebras.model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author g12345
 */
public class PiecesTest {

    public PiecesTest() {
    }

    /**
     * Test of getNbAnimals method, of class Pieces.
     */
    @Test
    public void testGetNbAnimalsInitial() {
        Pieces instance = new Pieces();
        assertTrue(
                instance.getNbAnimals(Species.GAZELLE, Color.RED) == 6
                && instance.getNbAnimals(Species.GAZELLE, Color.GREEN) == 6
                && instance.getNbAnimals(Species.ZEBRA, Color.RED) == 5
                && instance.getNbAnimals(Species.ZEBRA, Color.GREEN) == 5
                && instance.getNbAnimals(Species.CROCODILE, Color.RED) == 2
                && instance.getNbAnimals(Species.CROCODILE, Color.GREEN) == 2
                && instance.getNbAnimals(Species.LION, Color.RED) == 1
                && instance.getNbAnimals(Species.LION, Color.GREEN) == 1
                && instance.getNbAnimals(Species.ELEPHANT, Color.RED) == 1
                && instance.getNbAnimals(Species.ELEPHANT, Color.GREEN) == 1
        );
    }

    /**
     * Test of hasAvailable method, of class Pieces.
     */
    @Test
    public void testHasAvailableTrue() {
        Pieces instance = new Pieces();
        boolean result = instance.hasAvailable();
        assertTrue(result);
    }

    /**
     * Test of hasAvailable method, of class Pieces.
     */
    @Test
    public void testHasAvailableFalse() {
        Pieces instance = new Pieces();

        for (int i = 0; i < 6; i++) {
            instance.getAnimal(Species.GAZELLE, Color.RED);
            instance.getAnimal(Species.GAZELLE, Color.GREEN);
            if (i < 5) {
                instance.getAnimal(Species.ZEBRA, Color.RED);
                instance.getAnimal(Species.ZEBRA, Color.GREEN);
            }
            if (i < 2) {
                instance.getAnimal(Species.CROCODILE, Color.RED);
                instance.getAnimal(Species.CROCODILE, Color.GREEN);
            }
            if (i < 1) {
                instance.getAnimal(Species.LION, Color.RED);
                instance.getAnimal(Species.LION, Color.GREEN);
                instance.getAnimal(Species.ELEPHANT, Color.RED);
                instance.getAnimal(Species.ELEPHANT, Color.GREEN);
            }
        }

        boolean result = instance.hasAvailable();
        assertFalse(result);
    }

    /**
     * Test of getAnimal method, of class Pieces.
     */
    @Test
    public void testGetAnimalPass() {
        Species species = Species.CROCODILE;
        Color color = Color.RED;
        Pieces instance = new Pieces();
        Animal expResult = new Animal(species, color);
        Animal result = instance.getAnimal(species, color);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAnimal method, of class Pieces.
     */
    @Test
    public void testGetAnimalFail() {
        Species species = Species.ELEPHANT;
        Color color = Color.GREEN;
        Pieces instance = new Pieces();
        instance.getAnimal(species, color);
        Animal result = instance.getAnimal(species, color);
        assertNull(result);
    }

    /**
     * Test of getNbAnimals method, of class Pieces.
     */
    @Test
    public void testGetNbAnimalsAfterRemove() {
        Species species = Species.ELEPHANT;
        Color color = Color.GREEN;
        Pieces instance = new Pieces();
        instance.getAnimal(species, color);
        assertTrue(instance.getNbAnimals(species, color) == 0);
    }

    /**
     * Test of hasAvailable method, of class Pieces.
     */
    @Test
    public void testHasAvailable_Color1() {
        Pieces instance = new Pieces();

        for (int i = 0; i < 6; i++) {
            instance.getAnimal(Species.GAZELLE, Color.RED);
            instance.getAnimal(Species.GAZELLE, Color.GREEN);
            if (i < 5) {
                instance.getAnimal(Species.ZEBRA, Color.RED);
                instance.getAnimal(Species.ZEBRA, Color.GREEN);
            }
            if (i < 2) {
                instance.getAnimal(Species.CROCODILE, Color.RED);
                instance.getAnimal(Species.CROCODILE, Color.GREEN);
            }
            if (i < 1) {
                instance.getAnimal(Species.LION, Color.RED);
                instance.getAnimal(Species.LION, Color.GREEN);
                instance.getAnimal(Species.ELEPHANT, Color.RED);
                //instance.getAnimal(Species.ELEPHANT, Color.GREEN);
            }
        }

        Color color = Color.GREEN;
        boolean result = instance.hasAvailable(color);
        assertTrue(result);
    }

    /**
     * Test of hasAvailable method, of class Pieces.
     */
    @Test
    public void testHasAvailable_Color2() {
        Pieces instance = new Pieces();

        for (int i = 0; i < 6; i++) {
            instance.getAnimal(Species.GAZELLE, Color.RED);
            instance.getAnimal(Species.GAZELLE, Color.GREEN);
            if (i < 5) {
                instance.getAnimal(Species.ZEBRA, Color.RED);
                instance.getAnimal(Species.ZEBRA, Color.GREEN);
            }
            if (i < 2) {
                instance.getAnimal(Species.CROCODILE, Color.RED);
                instance.getAnimal(Species.CROCODILE, Color.GREEN);
            }
            if (i < 1) {
                instance.getAnimal(Species.LION, Color.RED);
                instance.getAnimal(Species.LION, Color.GREEN);
                //instance.getAnimal(Species.ELEPHANT, Color.RED);
                instance.getAnimal(Species.ELEPHANT, Color.GREEN);
            }
        }

        Color color = Color.GREEN;
        boolean result = instance.hasAvailable(color);
        assertFalse(result);
    }

}
