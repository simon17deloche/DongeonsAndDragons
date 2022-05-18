package Board;

public abstract class Cell {
    private String type;
    private String desc;

    //Constructor(s)
    public Cell(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    // Getters & Setters
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

}
