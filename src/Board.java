
public class Board {
    //--------------------------------------------------(Attributes)---------------------------------------------------
    private String[] types;
    private String[] cases;
    private int pose;
    private int dice;
    //-------------------------------------------------(Constructors)--------------------------------------------------
    public Board() {
        this.generate();
    }
    //----------------------------------------------------(Methods)----------------------------------------------------

    //-----------------------------------------------(Getters & Setters)-----------------------------------------------
    public String[] getCases() {
        return cases;
    }
    public int getDice() {
        return dice;
    }

    public void setCases(String[] cases) {
        this.cases = cases;
    }
    public void setDice(int dice) {
        this.dice = dice;
    }
    //----------------------------------------------(Functions / Methods)----------------------------------------------
    private void generate() {
        this.types = new String[]{"empty", "monster", "loot"};
        this.cases = new String[64];
        this.pose = 1;
    }

    public int playRound() {
        int i = 1;
        String[] tab = new String[64];
        while (i < tab.length) {
            int dice = (int) (Math.random() * 6) + 1;
            System.out.println("Vous lancez le dé, vous obtenez un " + dice);
            i+= dice;
            System.out.println("Vous êtes actuellement à la case " + i);
        }
        System.out.println("Félicitations, vous avez gagné !");
        return i;
    }
}

