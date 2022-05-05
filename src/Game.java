import Characters.Warrior;
import Characters.Wizard;

import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
        String champ;
        Character stats;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Saisir votre classe : ");

        System.out.println("Available classes are : Warrior and Wizard");
        System.out.println("If you want to leave, please write leave");
        champ = clavier.nextLine();
        System.out.println("Vous avez choisi : " + champ);
        if (champ.equals("Warrior")|| champ.equals("warrior")) {
            System.out.println("Warrior");

        } else if (champ.equals("Wizard") || champ.equals("wizard")) {
            System.out.println("Wizard");
        } else if (champ.equals("Leave") || champ.equals("leave")) {
            System.out.println("You left the game.");
        }

    }
}
