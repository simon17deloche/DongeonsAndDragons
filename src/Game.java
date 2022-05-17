import Characters.Warrior;
import Characters.Wizard;
import Characters.Character;
import java.util.Scanner;
public class Game {
    Character character;
    Scanner clavier;
    Board plateau = new Board();
    int stocker = plateau.getI();
    public static void main(String[] args) {
        Game starter = new Game();
        starter.start();
    }
    Game() {
        clavier = new Scanner(System.in);
    }
    public void start() {
        String champ;
        gameStarterMessages();
        classSelector();
        gameLauncher();
        if (64 <= plateau.getI()) {
            playAgain();
        }
    }
    private void gameStarterMessages(){
        System.out.println("\n" + "Bienvenue dans Donjons & Dragons !" + "\n");
        System.out.println("Vous pouvez choisir l'une de ces 2 classes pour pouvoir intégrer la partie :" + "\n" + "\n" + "-> Warrior" + "\n" + "-> Wizard" + "\n");
        System.out.println("Ecrivez le nom de la classe pour la séléctionner, ou quitter pour mettre fin à la session.");
    }
    private void classSelector() {
        String nomClass = null;
        String champ;
        champ = clavier.nextLine();
        System.out.println("Vous avez choisi : " + champ);
        if (champ.equalsIgnoreCase("Warrior")) {
            System.out.println();
            character = new Warrior();
            System.out.println("----------------------------");
            nomClass = "Guerrier(e)";
            System.out.println("PV : " + character.getHealth() + "\n" + "PV MAX : " + character.getMaxHealth() + "\n" + "Force : " + character.getStrength() + "\n" + "Force MAX : " + character.getMaxStrength());
            System.out.println("----------------------------");
        } else if (champ.equalsIgnoreCase("Wizard")) {
            System.out.println("Voici les Stats de votre personnage : ");
            character = new Wizard();
            System.out.println("----------------------------");
            nomClass = "Magicien(ne)";
            System.out.println("PV : " + character.getHealth() + "\n" + "PV MAX : " + character.getMaxHealth() + "\n" + "Force : " + character.getStrength() + "\n" + "Force MAX : " + character.getMaxStrength());
            System.out.println("----------------------------");
        } else if (champ.equalsIgnoreCase("Quitter")) {
            gameStopper();
        } else {
            System.out.println("Ce n'est pas une réponse valide");
        }
        if (champ.equalsIgnoreCase("warrior") || champ.equalsIgnoreCase("wizard")) {
            System.out.println("Quel est votre nom ?");
            champ = clavier.nextLine();
            System.out.println("Bienvenue dans l'aventure jeune " + nomClass + " nommé(e) " + champ);
        }
    }
    private void gameLauncher() {
        String champ;
        System.out.println("Voulez-vous démarrer la partie ? ");
        champ = clavier.nextLine();
        if (champ.equalsIgnoreCase("oui")) {
            System.out.println("Le jeu débute !");
            test();
        } else if (champ.equalsIgnoreCase("non")) {
            start();
        }
    }
    private void test() {
        String champ;
        while (plateau.getI() <= 64) {
            System.out.println("Que voulez-vous vous faire ?");
            System.out.println("Vous pouvez : Lancer votre dé" + "\n");
            champ = clavier.nextLine();
            if (champ.equalsIgnoreCase("dé")) {
                plateau.playRound();
            } else {
                System.out.println("non");
            }
        }
    }
    private void gameStopper() {
        clavier.close();
        System.out.println("Vous avez mis fin à la partie.");
    }
    private void gameRestarter() {
        start();
    }
    private void playAgain() {
        String champ;
        System.out.println("Voulez-vous relancer une partie ?");
        champ = clavier.nextLine();
        if (champ.equalsIgnoreCase("oui")) {
            gameRestarter();
        } else if (champ.equalsIgnoreCase("non")) {
            gameStopper();
        }
    }
}