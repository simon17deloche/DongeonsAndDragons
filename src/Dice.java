import Board.*;
public class Dice {
    private int position;
    private int dice;
    public Dice () {
        this.position = 0;
        this.dice = 0;
    }
    public void launchDice() {
        dice = (int) (Math.random() * 6) + 1;
        System.out.println("Vous lancez le dé, vous obtenez un " + dice);
        position += dice;
        int kase = position + 1;
        System.out.println("Vous êtes actuellement à la case " + kase);
        System.out.println("Vous êtes sur la case " + kase);
        System.out.println(position);
    }

    public int getposition() {return position;}
//    public int getJ() {return j;}
//    public int getDice() {return dice;}
}