package Board;

import Characters.Character;

/**
 * This is the public class named Potion extending of Cell.
 */
public class Potion extends Cell{
    /**
     * This is the constructor, used to fill the data with this class
     */
    public Potion() {super("Potion", "Elle peut vous permettre de vous rénégérer de la vie !");}

    /**
     * @param character here's the setter for the character of character
     */
    @Override
    public void interaction(Character character) {
        character.setHealth(character.getHealth() + 3);
    }

}
