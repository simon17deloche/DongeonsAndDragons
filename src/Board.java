import java.util.Arrays;

public class Board {
    //--------------------------------------------------(Attributes)---------------------------------------------------
    private String[] types;
    private String[] cases;
    private int pose;
    private int dice;
    private int i = 0;
    private int j = 0;
    String[] tab2 = new String[]{"empty", "monster", "loot"};
    String[] tab1 = new String[64];

    //-------------------------------------------------(Constructors)--------------------------------------------------
    public Board() {
        this.generate();
    }

    //----------------------------------------------------(Getters)----------------------------------------------------
    public String[] getCases() {
        return cases;
    }

    public int getDice() {
        return dice;
    }

    public String[] getTypes() {
        return types;
    }

    public int getPose() {
        return pose;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    //public String[] getTab() {return tab;}
    //----------------------------------------------------(Setters)----------------------------------------------------
    public void setCases(String[] cases) {
        this.cases = cases;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public void setPose(int pose) {
        this.pose = pose;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    //public void setTab(String[] tab) {this.tab = tab;}
    //----------------------------------------------(Functions / Methods)----------------------------------------------
    private void generate() {
        this.types = new String[]{"empty", "monster", "loot"};
        this.cases = new String[64];
        this.pose = 1;
    }

    public static void main(String[] args) {
        Board tester = new Board();
        tester.mathsCalculator();
    }
    public void playRound() {
        //if (i < tab.length) {
        int dice = (int) (Math.random() * 6) + 1;
        pose = pose + dice;
        System.out.println("Vous lancez le dé, vous obtenez un " + dice);
        i += dice;
        int kase = i + 1;
        System.out.println("Vous êtes actuellement à la case " + kase);
        System.out.println("Vous êtes sur la case " + kase);
    }
    //}
    private String[] mathsCalculator() {
        int test = 0;
        int maths = (int) (Math.random() * 3) + 1;
        while (test < 64) {
            if (maths == 1) {
                j = 0;
                tab1[i] = tab2[j];
            } else if (maths == 2) {
                j = 1;
                tab1[i] = tab2[j];
            } else if (maths == 3) {
                j = 2;
                tab1[i] = tab2[j];
            }
            test++;
        }
        return cases;
    }
}


