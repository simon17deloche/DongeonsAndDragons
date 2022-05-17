import java.util.Arrays;
public class Board {
    //--------------------------------------------------(Attributes)---------------------------------------------------
    private String[] types;
    private String[] cases;
    private int pose;
    private int i = 0;
    private int j = 0;
    private String[] tab2 = new String[]{"empty", "monster", "loot"};
    private String[] tab1 = new String[64];
    //-------------------------------------------------(Constructors)--------------------------------------------------
    public Board() {this.generate();}
    //----------------------------------------------(Functions / Methods)----------------------------------------------
    private void generate() {
        this.types = new String[]{"empty", "monster", "loot"};
        this.cases = new String[64];
        this.pose = 1;
    }
    public static void main(String[] args) {
        Board tester = new Board();
        tester.playRound();
    }
    public void playRound() {
        Dice roundDice = new Dice();
        roundDice.Throw();
    }
    //}
    private void mathsCalculator() {

    }
    //----------------------------------------------------(Getters)----------------------------------------------------
    public String[] getCases() {return cases;}
    public String[] getTypes() {return types;}
    public int getPose() {return pose;}
    public int getI() {return i;}
    public int getJ() {return j;}
    //public String[] getTab() {return tab;}
    //----------------------------------------------------(Setters)----------------------------------------------------
    public void setCases(String[] cases) {
        this.cases = cases;
    }
    public void setTypes(String[] types) {this.types = types;}
    public void setPose(int pose) {this.pose = pose;}
    public void setI(int i) {this.i = i;}
    public void setJ(int j) {this.j = j;}
    //public void setTab(String[] tab) {this.tab = tab;}
}


