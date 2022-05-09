public class Dice {

    /*  This program simulates rolling a pair of dice.
        The number that comes up on each die is output.
    */

    public static void main(String[] args) {

        int die1;   // The number on the first die.

        die1 = (int)(Math.random()*6) + 1;
        System.out.println("Vous avez fait : " + die1);

    }  // end main()

}  // end class