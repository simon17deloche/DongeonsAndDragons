import Characters.Warrior;
import Characters.Wizard;
import Characters.Character;
import java.util.Scanner;
public class Game {

    Character character;
    Scanner clavier;

    public static void main(String[] args) {
        Game starter = new Game();
        starter.start();
    }

    Game() {
        clavier = new Scanner(System.in);
    }
    public void start() {
        gameStarterMessages();
        classSelector();
        gameLauncher();
        playAgain();
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
        Board plateau = new Board();
        System.out.println("Voulez-vous démarrer la partie ? ");
        champ = clavier.nextLine();
        if (champ.equalsIgnoreCase("oui")) {
            System.out.println("Le jeu débute !");
            String test = String.valueOf(plateau.playRound());
            System.out.println(test);
        } else if (champ.equalsIgnoreCase("non")) {
            start();
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

//    String champ;
//        String nomClass = null;
//        Character stats = null;
//        Board plateau = new Board();
//        Scanner clavier = new Scanner(System.in);
//        System.out.println("Voici les classes disponible : : Warrior et Wizard");
//        System.out.println("Tapez 'Quitter' pour fermer le jeu.");
//        champ = clavier.nextLine();
//        System.out.println("Vous avez choisi : " + champ);
//        if (champ.equalsIgnoreCase("Warrior")) {
//            System.out.println();
//            stats = new Warrior();
//            System.out.println("----------------------------");
//            nomClass = "Guerrier(e)";
//            System.out.println("PV : " + stats.getHealth() + "\n" + "PV MAX : " + stats.getMaxHealth() + "\n" + "Force : " + stats.getStrength() + "\n" + "Force MAX : " + stats.getMaxStrength());
//            System.out.println("----------------------------");
//        } else if (champ.equalsIgnoreCase("Wizard")) {
//            System.out.println("Voici les Stats de votre personnage : ");
//            stats = new Wizard();
//            System.out.println("----------------------------");
//            nomClass = "Magicien(ne)";
//            System.out.println("PV : " + stats.getHealth() + "\n" + "PV MAX : " + stats.getMaxHealth() + "\n" + "Force : " + stats.getStrength() + "\n" + "Force MAX : " + stats.getMaxStrength());
//            System.out.println("----------------------------");
//        } else if (champ.equalsIgnoreCase("Quitter")) {
//            System.out.println("Vous avez quitté(e) le jeu.");
//        } else {
//            System.out.println("Ce n'est pas une réponse valide");
//        }
//        System.out.println("Quel est votre nom ?");
//        champ = clavier.nextLine();
//        System.out.println("Bienvenue dans l'aventure jeune " + nomClass + " nommé(e) " + champ);
//        System.out.println("Voulez-vous démarrer la partie ? ");
//        champ = clavier.nextLine();
//        if (champ.equalsIgnoreCase("oui")) {
//            System.out.println("Le jeu débute !");
//            String test = String.valueOf(plateau.playRound());
//            System.out.println(test);
//        } else if (champ.equalsIgnoreCase("non")) {
//            System.out.println("Vous avez quitté(e) le jeu.");
//        }
//        System.out.println("Voulez-vous recommencer ?");
//        champ = clavier.nextLine();
