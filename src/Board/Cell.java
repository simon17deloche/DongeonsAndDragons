package Board;

import Characters.Character;

/**
 * This is a public abstract class named Cell.
 */
public abstract class Cell {

    /**
     * here's all my attributes for the class named Cell
     */
    private String type;
    private String desc;

    //Constructor(s)

    /**
     * Public constructor
     * @param type String type.
     * @param desc String desc.
     */
    public Cell(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }
    // Getters & Setters

    /**
     * Here's the getter for the type.
     * @return type.
     */
    public String getType() {return type;}

    /**
     * Here's the getter for the description.
     * @return desc.
     */
    public String getDesc() {return desc;}

    /**
     * @param type here's the setter for the type of cell
     */
    public void setType(String type) {this.type =  type;}

    /**
     * @param desc here's the setter for the description of cell
     */
    public void setDesc(String desc) {this.desc = desc;}

    /**
     * @param character here's the setter for the character of character
     */
    public abstract void interaction(Character character);

    /**
     * @return the interaction
     */

    @Override
    public String toString() {
        return type;
    }
}
