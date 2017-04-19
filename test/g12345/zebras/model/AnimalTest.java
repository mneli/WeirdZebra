package g12345.zebras.model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author g12345
 */
public class AnimalTest {

    public AnimalTest() {
    }

    /**
     * Test of action method, of class Animal.
     */
    @Test
    public void testActionLionGazelle() {
        Animal other = new Animal(Species.GAZELLE, Color.RED);
        Animal instance = new Animal(Species.LION, Color.RED);
        instance.action(other);
        assertTrue(other.getState() == AnimalState.RUN);
    }

    /**
     * Test of action method, of class Animal.
     */
    @Test
    public void testActionLionZebra() {
        Animal other = new Animal(Species.ZEBRA, Color.RED);
        Animal instance = new Animal(Species.LION, Color.RED);
        instance.action(other);
        assertTrue(other.getState() == AnimalState.HIDDEN);
    }

    /**
     * Test of action method, of class Animal.
     */
    @Test
    public void testActionZebraLion() {
        Animal other = new Animal(Species.LION, Color.RED);
        Animal instance = new Animal(Species.ZEBRA, Color.RED);
        instance.action(other);
        assertTrue(instance.getState() == AnimalState.HIDDEN);
    }

    /**
     * Test of action method, of class Animal.
     */
    @Test
    public void testActionGazelleLion() {
        Animal other = new Animal(Species.LION, Color.RED);
        Animal instance = new Animal(Species.GAZELLE, Color.RED);
        instance.action(other);
        assertTrue(instance.getState() == AnimalState.HIDDEN);
    }

    /**
     * Test of action method, of class Animal.
     */
//    @Test
//    public void testAction() {
//        Animal other = new Animal(Species.GAZELLE, Color.RED);
//        Animal instance = new Animal(Species.LION, Color.RED);
//        instance.action(other);
//        assertTrue(other.getState() == AnimalState.RUN);
//    }
}
