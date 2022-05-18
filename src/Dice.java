import Board.*;
public class Dice {
    private int i;
    private int j;
    private int dice;

    public Dice () {
        this.i = 0;
        this.j = 0;
        this.dice = 0;
    }
    public int Throw() {
        dice = (int) (Math.random() * 6) + 1;
        System.out.println("Vous lancez le dé, vous obtenez un " + dice);
        i += dice;
        int kase = i + 1;
        System.out.println("Vous êtes actuellement à la case " + kase);
        System.out.println("Vous êtes sur la case " + kase);
        return kase;
    }
    public int Calc() {
        dice = (int) (Math.random() * 3) + 1;
        System.out.println("L'aléatoire à choisi le chiffre " + dice);
        return dice;
    }
}