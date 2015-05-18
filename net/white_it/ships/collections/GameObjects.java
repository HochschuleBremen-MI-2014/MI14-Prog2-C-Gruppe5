package net.white_it.ships.collections;

public class GameObjects {
    private static Spielersammlung spieler = new Spielersammlung();
    private static int round = 0;

    public static Spielersammlung getSpieler() {
        return spieler;
    }

    public static void setSpieler(Spielersammlung spieler) {
        GameObjects.spieler = spieler;
    }

    public static int getRound() {
        return round;
    }

    public static void increaseRound() {
        GameObjects.round++;
    }
}