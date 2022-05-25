package Board;

import Characters.Character;

/**
 * This is a class named Empty extending of Cell.
 */
public class Empty extends Cell {

    /**
     * This is the constructor, used to fill the data with this class
     */
    public Empty() {super("Empty","Ceci est une case vide !");}

    @Override
    /**
     * This is made to interact with the player.
     */
    public void interaction(Character character) {
    }
}
