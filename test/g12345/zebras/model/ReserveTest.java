package g12345.zebras.model;

import java.util.ArrayList;
import java.util.List;
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

    /**
     * Test of getAdjacents method, of class Reserve.
     */
    @Test
    public void testGetAdjacents1() {
        Coordinates position = new Coordinates(0, 0);
        Reserve instance = new Reserve();
        List<Coordinates> expResult = new ArrayList<>(2);
        expResult.add(new Coordinates(1, 0));
        expResult.add(new Coordinates(0, 1));
        List<Coordinates> result = instance.getAdjacents(position);
        assertTrue(result.containsAll(expResult));
    }

    /**
     * Test of getAdjacents method, of class Reserve.
     */
    @Test
    public void testGetAdjacents2() {
        Coordinates position = new Coordinates(3, 5);
        Reserve instance = new Reserve();
        List<Coordinates> expResult = new ArrayList<>(3);
        expResult.add(new Coordinates(2, 5));
        expResult.add(new Coordinates(4, 5));
        expResult.add(new Coordinates(3, 4));
        List<Coordinates> result = instance.getAdjacents(position);
        assertTrue(result.containsAll(expResult));
    }

    /**
     * Test of getAdjacents method, of class Reserve.
     */
    @Test
    public void testGetAdjacents3() {
        Coordinates position = new Coordinates(2, 2);
        Reserve instance = new Reserve();
        List<Coordinates> expResult = new ArrayList<>(4);
        expResult.add(new Coordinates(1, 2));
        expResult.add(new Coordinates(3, 2));
        expResult.add(new Coordinates(2, 1));
        expResult.add(new Coordinates(2, 3));
        List<Coordinates> result = instance.getAdjacents(position);
        assertTrue(result.containsAll(expResult));
    }

}
