package g12345.zebras.model;

import java.util.List;

/**
 *
 * @author g12345
 */
public class Game implements Model {

    @Override
    public void start() {
        throw new GameException();
    }

    @Override
    public void setImpalaJonesFirstPosition(int position) {
        throw new GameException();
    }

    @Override
    public void putAnimal(Coordinates position, Species species) {
        throw new GameException();
    }

    @Override
    public void moveImpalaJones(int distance) {
        throw new GameException();
    }

    @Override
    public boolean isOver() {
        throw new GameException();
    }

    @Override
    public GameStatus getStatus() {
        throw new GameException();
    }

    @Override
    public Color getCurrentColor() {
        throw new GameException();
    }

    @Override
    public List<Player> getPlayers() {
        throw new GameException();
    }

    @Override
    public Reserve getReserve() {
        throw new GameException();
    }

    @Override
    public int getNb(Species species) {
        throw new GameException();
    }

    @Override
    public ImpalaJones getImpalaJones() {
        throw new GameException();
    }

    @Override
    public int getScore(Color color) {
        throw new GameException();
    }

}
