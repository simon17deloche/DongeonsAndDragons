package Board;

import Characters.Character;

/**
 * This is a class named Monster extending of Cell.
 */

public class Monster extends Cell{
    /**
     * This is the constructor, used to fill the data with this class
     */

    public Monster() {super("Monster","Ceci est une case monstre !");}

    @Override
    public void interaction(Character character) {

    }
}
