package g12345.zebras.model;

/**
 *
 * @author g12345
 * @group Expression group is undefined on line 13, column 13 in
 * Templates/Classes/Exception.java.
 */
public class GameException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new instance of <code>GameException</code> without detail
     * message.
     */
    GameException() {
    }

    /**
     * Constructs an instance of <code>GameException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    GameException(String msg) {
        super(msg);
    }
}
