import Characters.Warrior;
import Characters.Wizard;
import Characters.Character;
import java.util.Scanner;
public class Game {
    int L = 0;
    public static void main(String[] args) {
        String champ;
        String nomClass = null;
        Character stats = null;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Voici les classes disponible : : Warrior et Wizard");
        System.out.println("Tapez 'Quitter' pour fermer le jeu.");
        champ = clavier.nextLine();
        System.out.println("Vous avez choisi : " + champ);
        if (champ.equalsIgnoreCase("Warrior")) {
            stats = new Warrior();
            System.out.println("----------------------------");
            nomClass = "Guerrier(e)";
            System.out.println("PV : " + stats.getHealth() + "\n" + "PV MAX : " + stats.getMaxHealth() + "\n" + "Force : " + stats.getStrength() + "\n" + "Force MAX : " + stats.getMaxStrength());
            System.out.println("----------------------------");
        } else if (champ.equalsIgnoreCase("Wizard")) {
            System.out.println("Voici les Stats de votre personnage : ");
            stats = new Wizard();
            System.out.println("----------------------------");
            nomClass = "Magicien(ne)";
            System.out.println("PV : " + stats.getHealth() + "\n" + "PV MAX : " + stats.getMaxHealth() + "\n" + "Force : " + stats.getStrength() + "\n" + "Force MAX : " + stats.getMaxStrength());
            System.out.println("----------------------------");
        } else if (champ.equalsIgnoreCase("Quitter")) {
            System.out.println("Vous avez quitté(e) le jeu.");
        } else {
            System.out.println("Ce n'est pas une réponse valide");
        }
        System.out.println("Quel est votre nom ?");
        champ = clavier.nextLine();
        System.out.println("Bienvenue dans l'aventure jeune " + nomClass + " nommé(e) " + champ);
    }
}
