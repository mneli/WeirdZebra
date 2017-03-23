package g12345.zebras.model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author g12345
 */
public class ReserveTest {

    public ReserveTest() {
    }

    /**
     * Test of getAnimal method, of class Reserve.
     */
    @Test
    public void testGetAnimal() {
        Animal animal = new Animal(Species.GAZELLE, Color.RED);
        Coordinates pos = new Coordinates(0, 0);
        Reserve instance = new Reserve();
        instance.put(animal, pos);
        Animal expected = instance.getAnimal(pos);
        assertEquals(animal, expected);
    }

    /**
     * Test of put method, of class Reserve.
     */
    @Test
    public void testPut() {
        Animal animal = new Animal(Species.CROCODILE, Color.GREEN);
        Coordinates pos = new Coordinates(0, 0);
        Reserve instance = new Reserve();
        instance.put(animal, pos);
        Animal expected = instance.getAnimal(pos);
        assertEquals(animal, expected);
    }

    /**
     * Test of isFree method, of class Reserve.
     */
    @Test
    public void testIsFreeTrue() {
        Coordinates pos = new Coordinates(0, 0);
        Reserve instance = new Reserve();
        boolean expResult = true;
        boolean result = instance.isFree(pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of isFree method, of class Reserve.
     */
    @Test
    public void testIsFreeFalse() {
        Coordinates pos = new Coordinates(0, 0);
        Reserve instance = new Reserve();
        Animal animal = new Animal(Species.GAZELLE, Color.RED);
        instance.put(animal, pos);
        boolean expResult = false;
        boolean result = instance.isFree(pos);
        assertEquals(expResult, result);
    }

}
