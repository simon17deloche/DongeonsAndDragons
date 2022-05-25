import java.util.Arrays;
import Board.*;
import Characters.Character;

public class Board {
    //--------------------------------------------------(Attributes)---------------------------------------------------
    private int randomCalc;
    private final Cell[] gameBoard = new Cell[64];
    //-------------------------------------------------(Constructors)--------------------------------------------------
    public Board() {}
    //----------------------------------------------(Functions / Methods)----------------------------------------------

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
            int comp = 0;
            while (comp < gameBoard.length) {
                int stockBoardFiller = boardCalc();
                if (stockBoardFiller == 1) {
                    gameBoard[comp] = new Empty();
                } else if (stockBoardFiller == 2) {
                    gameBoard[comp] = new Monster();
                } else if (stockBoardFiller == 3) {
                    gameBoard[comp] = new Loot();
                } else if (stockBoardFiller == 4) {
                    gameBoard[comp] = new Potion();
                }
                comp = comp + 1;
            }
        } catch (Exception e) {
            System.out.println("Erreur");
        }
        System.out.println(Arrays.toString(gameBoard));
    }

    public void boardMoovement(Character character, int position) {
        Cell cell = this.gameBoard[position];
        System.out.println("Le héro est arrivé en case " + position + ": " + cell.getType());

        cell.interaction(character);
    }
}
    //----------------------------------------------------(Getters)----------------------------------------------------

    //----------------------------------------------------(Setters)----------------------------------------------------



