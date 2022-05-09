
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
    public static void main(String[] args) {
        Board plateau = new Board();
        String[] cases = plateau.getCases();
        for (int i = 0; i <= cases.length; i + dice) {
            plateau.playRound();
        }
    }
    private void generate() {
        this.types = new String[]{"empty", "monster", "loot"};
        this.cases = new String[64];
        this.pose = 1;
    }

    public void playRound() {
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Vous avez fait : " + dice);
    }
}

