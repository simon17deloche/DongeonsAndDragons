import java.util.Arrays;
import Board.*;
public class Board {
    //--------------------------------------------------(Attributes)---------------------------------------------------
    private String[] types;
    private String[] cases;
    private int pose;
    private int i = 0;
    private int j = 0;
    private int comp = 0;
    private final String[] gameBoard = new String[64];
    Dice roundDice = new Dice();
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
        tester.boardGenerator();
        //tester.printer();
    }
    public void playRound() {

    }
    //}
    public void printer() {

    }
    private void boardGenerator() {
        Cell cell;
        while (comp < gameBoard.length) {
            int stockBoardFiller = roundDice.Calc();
            if (stockBoardFiller == 1) {
                cell = new Empty();
                System.out.println(cell.getDesc());
            } else if (stockBoardFiller == 2) {
                cell = new Monster();
                System.out.println(cell.getDesc());
            } else if (stockBoardFiller == 3) {
                cell = new Loot();
                System.out.println(cell.getDesc());
            }
            comp = comp + 1;
        }
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


