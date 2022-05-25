package Board;

import Characters.Character;

/**
 * This is a class named Loot extending of Cell.
 */
public class Loot extends Cell {
    /**
     * This is the constructor, used to fill the data with this class
     */

    public Loot() {super("Loot", "C'est une case d'équipement !");}

    @Override
    public void interaction(Character character) {

    }
}
