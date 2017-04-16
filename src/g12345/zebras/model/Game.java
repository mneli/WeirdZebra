package g12345.zebras.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author g12345
 */
public class Game implements Model {

    private final List<Player> players;
    private final Reserve reserve;
    private final ImpalaJones impala;
    private final Pieces pieces;
    private final GameStatus status;
    private final int currentPlayer;

    public Game() {

        this.players = new ArrayList<>(2);
        players.add(new Player(Color.RED));
        players.add(new Player(Color.GREEN));

        this.reserve = new Reserve();

        this.impala = new ImpalaJones();

        this.pieces = new Pieces();

        this.status = GameStatus.INIT;

        this.currentPlayer = 0;
    }

    /**
     * Start a match and reset attributes.
     */
    @Override
    public void start() {
        //TODO
    }

    /**
     * Set Impala Jones first position.
     *
     * @param position of Impala Jones at the beginning of game
     * @throws GameException if game's status isn't GameStatus.INIT.
     */
    @Override
    public void setImpalaJonesFirstPosition(int position) {
        if (this.status != GameStatus.INIT)
            throw new GameException();
        this.impala.init(position);
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
        if (this.status != GameStatus.ANIMAL
                || !this.impala.valid(position)
                || !this.reserve.isFree(position)
                || this.pieces.getNbAnimals(species,
                        getCurrentColor()) == 0)
            throw new GameException();
        this.reserve.put(this.pieces.getAnimal(species, getCurrentColor()), position);
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
        if (this.status != GameStatus.IMPALA
                || !this.impala.checkMove(this.reserve, distance)
                || distance < 1 || distance > 21)
            throw new GameException();
        this.impala.move(distance);
    }

    /**
     * Return true if the game is over.
     *
     * @return true if the game is over
     */
    @Override
    public boolean isOver() {
        return !this.pieces.hasAvailable();
    }

    /**
     * Return the state of the game.
     *
     * @return the state of the game
     */
    @Override
    public GameStatus getStatus() {
        return this.status;
    }

    /**
     * Return the current player color.
     *
     * @return the current player color
     */
    @Override
    public Color getCurrentColor() {
        return this.players.get(this.currentPlayer).getColor();
    }

    /**
     * Return the list of all player.
     *
     * @return the list of all player
     */
    @Override
    public List<Player> getPlayers() {
        return this.players;
    }

    /**
     * Return the reserve.
     *
     * @return the reserve.
     */
    @Override
    public Reserve getReserve() {
        return this.reserve;
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
        return this.pieces.getNbAnimals(species, getCurrentColor());
    }

    /**
     * Return Impala Jones.
     *
     * @return Impala Jones
     */
    @Override
    public ImpalaJones getImpalaJones() {
        return this.impala;
    }

    /**
     * Get the score of the player of the given color.
     *
     * @param color the color of the player
     * @return the score of the player of the given color.
     */
    @Override
    public int getScore(Color color) {
        //TODO
        return 0;
    }

}
