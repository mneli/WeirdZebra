package g12345.zebras.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author g12345
 */
public class Game implements Model {

    private List<Player> players;
    private Reserve reserve;
    private ImpalaJones impala;
    private Pieces pieces;
    private GameStatus gameStatus;
    private int currentPlayer;

    public Game() {

        this.players = new ArrayList<>(2);
        players.add(new Player(Color.RED));
        players.add(new Player(Color.GREEN));

        this.reserve = new Reserve();

        this.impala = new ImpalaJones();

        this.pieces = new Pieces();

        this.gameStatus = GameStatus.INIT;

        this.currentPlayer = 0;
    }

    /**
     * Start a match and reset attributes.
     */
    @Override
    public void start() {

    }

    /**
     * Set Impala Jones first position.
     *
     * @param position of Impala Jones at the beginning of game
     * @throws GameException if game's status isn't GameStatus.INIT.
     */
    @Override
    public void setImpalaJonesFirstPosition(int position) {
        throw new GameException();
    }

    /**
     * Put an animal in the Board. Put an animal of the given species for the
     * current player.
     *
     * @param position position on the board
     * @param species species of an animal
     * @throws GameException if
     * <ul>
     * <li>game's status isn't Status.ANIMAL</li>
     * <li>or Impala Jones isn't on the the same row or column</li>
     * <li>or that position is not free</li>
     * <li>or the current player doesn't have that a tile of that species to
     * play anymore</li>
     * </ul>
     */
    @Override
    public void putAnimal(Coordinates position, Species species) {
        throw new GameException();
    }

    /**
     * Move Impala Jones some steps forward.
     *
     * @param distance number of step
     * @throws GameException if
     * <ul>
     * <li>game's status isn't Status.IMPALA</li>
     * <li>or ImpalaJones will arrive on a full row or column</li>
     * <li>or the distance is too large</li>
     * </ul>
     */
    @Override
    public void moveImpalaJones(int distance) {
        throw new GameException();
    }

    /**
     * Return true if the game is over.
     *
     * @return true if the game is over
     */
    @Override
    public boolean isOver() {
    }

    /**
     * Return the state of the game.
     *
     * @return the state of the game
     */
    @Override
    public GameStatus getStatus() {
    }

    /**
     * Return the current player color.
     *
     * @return the current player color
     */
    @Override
    public Color getCurrentColor() {
    }

    /**
     * Return the list of all player.
     *
     * @return the list of all player
     */
    @Override
    public List<Player> getPlayers() {
    }

    /**
     * Return the reserve.
     *
     * @return the reserve.
     */
    @Override
    public Reserve getReserve() {
    }

    /**
     * Return the amount of animals of the specified species that the curent
     * player can put in the reserve.
     *
     * @param species of the animal searched
     * @return the amount of animals of the specified species for the current
     * player, left in the stock.
     */
    @Override
    public int getNb(Species species) {
    }

    /**
     * Return Impala Jones.
     *
     * @return Impala Jones
     */
    @Override
    public ImpalaJones getImpalaJones() {
    }

    /**
     * Get the score of the player of the given color.
     *
     * @param color the color of the player
     * @return the score of the player of the given color.
     */
    @Override
    public int getScore(Color color) {
    }

}
