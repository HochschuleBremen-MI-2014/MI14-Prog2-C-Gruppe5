package net.white_it.ships.models;

public class Fregatte extends Schiff {

    public final static int size = 4;

    public Fregatte(boolean ausrichtung, int coordX, int coordY) {
        super(Fregatte.size, 2, 2, ausrichtung, coordX, coordY);
    }
}
