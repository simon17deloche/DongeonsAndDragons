
public class Board {
    //--------------------------------------------------(Attributes)---------------------------------------------------
    private String[] types;
    private String[] cases;
    private int pose;
    private int dice;
    int i = 1;
    String[] tab = new String[64];
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
    public String[] getTypes() {return types;}
    public int getPose() {return pose;}
    public int getI() {return i;}
    public String[] getTab() {return tab;}
    //----------------------------------------------------(Setters)----------------------------------------------------
    public void setCases(String[] cases) {
        this.cases = cases;
    }
    public void setDice(int dice) {
        this.dice = dice;
    }
    public void setI(int i) {this.i = i;}
    public void setTab(String[] tab) {this.tab = tab;}
    public void setPose(int pose) {this.pose = pose;}
    public void setTypes(String[] types) {this.types = types;}
    //----------------------------------------------(Functions / Methods)----------------------------------------------
    private void generate() {
        this.types = new String[]{"empty", "monster", "loot"};
        this.cases = new String[64];
        this.pose = 1;
    }
    public int playRound() {
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

