package Board;

public abstract class Cell {
    private String type;

    //Constructor(s)
    public Cell(String type) {
        this.type = type;
    }

    // Getters & Setters
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

}
