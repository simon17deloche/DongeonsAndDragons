public class Dice {
    public Dice () {
    }
    public int launchDice() {
        return (int) (Math.random() * 6) + 1;
    }
}