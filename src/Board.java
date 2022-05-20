import java.util.Arrays;
import Board.*;
public class Board {
    //--------------------------------------------------(Attributes)---------------------------------------------------
    private String[] types;
    private String[] cases;
    private int pose;
    private int randomCalc;
    private final String[] gameBoard = new String[64];
    //-------------------------------------------------(Constructors)--------------------------------------------------
    public Board() {this.generate();}
    //----------------------------------------------(Functions / Methods)----------------------------------------------
    private void generate() {
        this.types = new String[]{"empty", "monster", "loot"};
        this.cases = new String[64];
        this.pose = 0;
    }

    public static void main(String[] args) {
        Board tester = new Board();
        //tester.boardMoovement();
        //tester.printer();
    }
    public int boardCalc() {
        int ret = 0;
        randomCalc = (int) (Math.random() * 100) + 1;
        if (randomCalc >= 1 && randomCalc <= 24) {
            ret = 1;
            // Case Empty
            // 25 % de chance
        } else if (randomCalc >= 25 && randomCalc <= 59) {
            ret = 2;
            // Case Monster
            // 35 % de chance
        } else if (randomCalc >= 60 && randomCalc <= 80) {
            ret = 3;
            // Case Loot
            // 20 % de chance
        } else if (randomCalc >= 81 && randomCalc <= 100) {
            ret = 4;
            // Case Potion
            // 20 % de chance
        }

        return ret;
    }

    //    public void setI(int i) {this.position = i;}
//    public void setJ(int j) {this.j = j;}
//    public void setDice(int dice) {this.dice = dice;}
    public void boardGenerator() {
        try {
            Cell cell;
            int comp = 0;
            while (comp < gameBoard.length) {
                int stockBoardFiller = boardCalc();
                if (stockBoardFiller == 1) {
                    cell = new Empty();
                    gameBoard[comp] = cell.getType();
                } else if (stockBoardFiller == 2) {
                    cell = new Monster();
                    gameBoard[comp] = cell.getType();
                } else if (stockBoardFiller == 3) {
                    cell = new Loot();
                    gameBoard[comp] = cell.getType();
                } else if (stockBoardFiller == 4) {
                    cell = new Potion();
                    gameBoard[comp] = cell.getType();
                }
                comp = comp + 1;
            }
        } catch (Exception e) {
            System.out.println("Erreur");
        }
        System.out.println(Arrays.toString(gameBoard));
    }

    public void boardMoovement() {
    }
}
    //----------------------------------------------------(Getters)----------------------------------------------------

    //----------------------------------------------------(Setters)----------------------------------------------------



