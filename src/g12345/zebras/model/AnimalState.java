package g12345.zebras.model;

/**
 * Describe the state of the animal during a game.
 *
 * @author g12345
 */
public enum AnimalState {

    /**
     * The animal is placed in the reserve. Natural/neutral state.
     */
    REST,
    /**
     * The animal is scared. The animal is placed with the face down.
     */
    HIDDEN,
    /**
     * The animal fled.
     */
    RUN;
}
