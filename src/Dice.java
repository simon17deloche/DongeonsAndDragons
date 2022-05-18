public class Dice {
    private int i;
    private int dice;
    private Board plateau = new Board();

    public Dice () {
        this.i = 0;
        this.dice = 0;
    }
    public void Throw() {
        dice = (int) (Math.random() * 6) + 1;
        System.out.println("Vous lancez le dé, vous obtenez un " + dice);
        i += dice;
        int kase = i + 1;
        System.out.println("Vous êtes actuellement à la case " + kase);
        System.out.println("Vous êtes sur la case " + kase);
    }
//    public void Calc() {
//        dice = (int) (Math.random() * 3) + 1;
//        if (i < plateau.getCases().length) {
//            System.out.println("bonjour");
//        } else {
//            System.out.println("pas bonjour");
//        }
//    }
}