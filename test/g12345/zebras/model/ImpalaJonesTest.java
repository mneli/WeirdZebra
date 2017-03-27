package g12345.zebras.model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author g12345
 */
public class ImpalaJonesTest {

    public ImpalaJonesTest() {
    }

    /**
     * Test of getPosition method, of class ImpalaJones.
     */
    @Test
    public void testGetPosition() {
        ImpalaJones instance = new ImpalaJones();
        int expResult = -1;
        int result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of init method, of class ImpalaJones.
     */
    @Test
    public void testInit() {
        int nb = 0;
        ImpalaJones instance = new ImpalaJones();
        instance.init(nb);
        int expResult = nb;
        int result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class ImpalaJones.
     */
    @Test
    public void testMove() {
        int initialPos = 0;
        int distance = 3;
        ImpalaJones instance = new ImpalaJones();
        instance.init(initialPos);
        instance.move(distance);
        int expResult = initialPos + distance;
        int result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class ImpalaJones.
     */
    @Test
    public void testMoveEdge() {
        int initialPos = 21;
        int distance = 3;
        ImpalaJones instance = new ImpalaJones();
        instance.init(initialPos);
        instance.move(distance);
        int expResult = 2;
        int result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class ImpalaJones. Useful for checMove.
     */
    @Test
    public void testMoveNegatif() {
        int initialPos = 0;
        int distance = -3;
        ImpalaJones instance = new ImpalaJones();
        instance.init(initialPos);
        instance.move(distance);
        int expResult = 19;
        int result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of isUp method, of class ImpalaJones.
     */
    @Test
    public void testIsUpTrue() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(5);
        assertTrue(instance.isUp());
    }

    /**
     * Test of isUp method, of class ImpalaJones.
     */
    @Test
    public void testIsUpFalse() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(20);
        assertFalse(instance.isUp());
    }

    /**
     * Test of isUp method, of class ImpalaJones.
     */
    @Test
    public void testIsUpFalse2() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(8);
        assertFalse(instance.isUp());
    }

    /**
     * Test of isUp method, of class ImpalaJones.
     */
    @Test
    public void testIsUpFalse3() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(15);
        assertFalse(instance.isUp());
    }

    /**
     * Test of isDown method, of class ImpalaJones.
     */
    @Test
    public void testIsDown() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(15);
        assertTrue(instance.isDown());
    }

    /**
     * Test of isLeft method, of class ImpalaJones.
     */
    @Test
    public void testIsLeft() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(20);
        assertTrue(instance.isLeft());
    }

    /**
     * Test of isRight method, of class ImpalaJones.
     */
    @Test
    public void testIsRight() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(10);
        assertTrue(instance.isRight());
    }

    /**
     * Test of getColumn method, of class ImpalaJones.
     */
    @Test
    public void testGetColumnImpalaUp() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(3);
        int expResult = 3;
        int result = instance.getColumn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColumn method, of class ImpalaJones.
     */
    @Test
    public void testGetColumnImpalaDown() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(13);
        int expResult = 3;
        int result = instance.getColumn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColumn method, of class ImpalaJones.
     */
    @Test
    public void testGetColumnImpalaLeft() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(20);
        int expResult = -1;
        int result = instance.getColumn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColumn method, of class ImpalaJones.
     */
    @Test
    public void testGetColumnImpalaRight() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(7);
        int expResult = -1;
        int result = instance.getColumn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRow method, of class ImpalaJones.
     */
    @Test
    public void testGetRowImpalaLeft() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(18);
        int expResult = 3;
        int result = instance.getRow();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRow method, of class ImpalaJones.
     */
    @Test
    public void testGetRowImpalaRight() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(9);
        int expResult = 3;
        int result = instance.getRow();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRow method, of class ImpalaJones.
     */
    @Test
    public void testGetRowImpalaUp() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(4);
        int expResult = -1;
        int result = instance.getRow();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRow method, of class ImpalaJones.
     */
    @Test
    public void testGetRowImpalaDown() {
        ImpalaJones instance = new ImpalaJones();
        instance.init(13);
        int expResult = -1;
        int result = instance.getRow();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkMove method, of class ImpalaJones.
     */
    @Test
    public void testCheckMoveEmptyColumn() {
        Reserve reserve = new Reserve();
        int distance = 1;
        ImpalaJones instance = new ImpalaJones();
        instance.init(0);
        boolean result = instance.checkMove(reserve, distance);
        assertTrue(result && instance.getPosition() == 0);
    }

    /**
     * Test of checkMove method, of class ImpalaJones.
     */
    @Test
    public void testCheckMoveHalfEmptyColumn() {
        Reserve reserve = new Reserve();
        int distance = 1;
        ImpalaJones instance = new ImpalaJones();
        instance.init(0);
        Animal animal = new Animal(Species.GAZELLE, Color.RED);
        reserve.put(animal, new Coordinates(0, 1));
        reserve.put(animal, new Coordinates(1, 1));
        reserve.put(animal, new Coordinates(2, 1));
        boolean result = instance.checkMove(reserve, distance);
        assertTrue(result && instance.getPosition() == 0);
    }

    /**
     * Test of checkMove method, of class ImpalaJones.
     */
    @Test
    public void testCheckMoveFullColumn() {
        Reserve reserve = new Reserve();
        int distance = 1;
        ImpalaJones instance = new ImpalaJones();
        instance.init(0);
        Animal animal = new Animal(Species.GAZELLE, Color.RED);
        reserve.put(animal, new Coordinates(0, 1));
        reserve.put(animal, new Coordinates(1, 1));
        reserve.put(animal, new Coordinates(2, 1));
        reserve.put(animal, new Coordinates(3, 1));
        reserve.put(animal, new Coordinates(4, 1));
        boolean result = instance.checkMove(reserve, distance);
        assertTrue(!result && instance.getPosition() == 0);
    }

    /**
     * Test of checkMove method, of class ImpalaJones.
     */
    @Test
    public void testCheckMoveEmptyRow() {
        Reserve reserve = new Reserve();
        int distance = 2;
        ImpalaJones instance = new ImpalaJones();
        instance.init(5);
        boolean result = instance.checkMove(reserve, distance);
        assertTrue(result && instance.getPosition() == 5);
    }

    /**
     * Test of checkMove method, of class ImpalaJones.
     */
    @Test
    public void testCheckMoveHalfEmptyRow() {
        Reserve reserve = new Reserve();
        int distance = 1;
        ImpalaJones instance = new ImpalaJones();
        instance.init(16);
        Animal animal = new Animal(Species.GAZELLE, Color.RED);
        reserve.put(animal, new Coordinates(4, 0));
        reserve.put(animal, new Coordinates(4, 1));
        reserve.put(animal, new Coordinates(4, 2));
        boolean result = instance.checkMove(reserve, distance);
        assertTrue(result && instance.getPosition() == 16);
    }

    /**
     * Test of checkMove method, of class ImpalaJones.
     */
    @Test
    public void testCheckMoveFullRow() {
        Reserve reserve = new Reserve();
        int distance = 1;
        ImpalaJones instance = new ImpalaJones();
        instance.init(16);
        Animal animal = new Animal(Species.GAZELLE, Color.RED);
        reserve.put(animal, new Coordinates(4, 0));
        reserve.put(animal, new Coordinates(4, 1));
        reserve.put(animal, new Coordinates(4, 2));
        reserve.put(animal, new Coordinates(4, 3));
        reserve.put(animal, new Coordinates(4, 4));
        reserve.put(animal, new Coordinates(4, 5));
        boolean result = instance.checkMove(reserve, distance);
        assertTrue(!result && instance.getPosition() == 16);
    }

    /**
     * Test of valid method, of class ImpalaJones.
     */
    @Test
    public void testValidImpalaUp() {
        Coordinates pos = new Coordinates(2, 2);
        ImpalaJones instance = new ImpalaJones();
        instance.init(2);
        boolean result = instance.valid(pos);
        assertTrue(result);
    }

    /**
     * Test of valid method, of class ImpalaJones.
     */
    @Test
    public void testValidImpalaDown() {
        Coordinates pos = new Coordinates(2, 2);
        ImpalaJones instance = new ImpalaJones();
        instance.init(14);
        boolean result = instance.valid(pos);
        assertTrue(result);
    }

    /**
     * Test of valid method, of class ImpalaJones.
     */
    @Test
    public void testValidImpalaLeft() {
        Coordinates pos = new Coordinates(2, 2);
        ImpalaJones instance = new ImpalaJones();
        instance.init(19);
        boolean result = instance.valid(pos);
        assertTrue(result);
    }

    /**
     * Test of valid method, of class ImpalaJones.
     */
    @Test
    public void testValidImpalaRight() {
        Coordinates pos = new Coordinates(2, 2);
        ImpalaJones instance = new ImpalaJones();
        instance.init(8);
        boolean result = instance.valid(pos);
        assertTrue(result);
    }

    /**
     * Test of valid method, of class ImpalaJones.
     */
    @Test
    public void testValidImpalaUpFalse() {
        Coordinates pos = new Coordinates(2, 2);
        ImpalaJones instance = new ImpalaJones();
        instance.init(1);
        boolean result = instance.valid(pos);
        assertFalse(result);
    }

    /**
     * Test of valid method, of class ImpalaJones.
     */
    @Test
    public void testValidImpalaDownFalse() {
        Coordinates pos = new Coordinates(2, 2);
        ImpalaJones instance = new ImpalaJones();
        instance.init(13);
        boolean result = instance.valid(pos);
        assertFalse(result);
    }

    /**
     * Test of valid method, of class ImpalaJones.
     */
    @Test
    public void testValidImpalaLeftFalse() {
        Coordinates pos = new Coordinates(2, 2);
        ImpalaJones instance = new ImpalaJones();
        instance.init(20);
        boolean result = instance.valid(pos);
        assertFalse(result);
    }

    /**
     * Test of valid method, of class ImpalaJones.
     */
    @Test
    public void testValidImpalaRightFalse() {
        Coordinates pos = new Coordinates(2, 2);
        ImpalaJones instance = new ImpalaJones();
        instance.init(9);
        boolean result = instance.valid(pos);
        assertFalse(result);
    }

    /**
     * Test of findFirst method, of class ImpalaJones.
     */
    @Test
    public void testFindFirst() {
        Reserve reserve = new Reserve();
        ImpalaJones instance = new ImpalaJones();
        instance.init(0);
        int expResult = 1;
        int result = instance.findFirst(reserve);
        assertEquals(expResult, result);
    }

    /**
     * Test of findFirst method, of class ImpalaJones.
     */
    @Test
    public void testFindFirst2() {
        Reserve reserve = new Reserve();
        ImpalaJones instance = new ImpalaJones();
        instance.init(0);
        Animal animal = new Animal(Species.GAZELLE, Color.RED);
        reserve.put(animal, new Coordinates(0, 1));
        reserve.put(animal, new Coordinates(1, 1));
        reserve.put(animal, new Coordinates(2, 1));
        reserve.put(animal, new Coordinates(3, 1));
        reserve.put(animal, new Coordinates(4, 1));
        int expResult = 2;
        int result = instance.findFirst(reserve);
        assertEquals(expResult, result);
    }

}
