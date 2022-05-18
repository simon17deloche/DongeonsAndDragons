package Board;

public abstract class Cell {

    /**
     * here's all my attributes for the class named Cell
     */
    private String type;
    private String desc;

    //Constructor(s)
    public Cell(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }
    // Getters & Setters
    public String getType() {return type;}
    public String getDesc() {return desc;}

    /**
     * @param type here's the setter for the type of cell
     */
    public void setType(String type) {this.type =  type;}

    /**
     * @param desc here's the setter for the description of cell
     */
    public void setDesc(String desc) {this.desc = desc;}

}
