import Characters.Warrior;
import Characters.Wizard;
import Characters.Character;
import java.util.Scanner;

/**
 * Making an instance of classes needed for the call of other methods.
 */
public class Game {
    Character character;
    Scanner clavier;
    Board plateau = new Board();
    Dice roundDice = new Dice();
    int position = 0;

    /**
     * This is the main method, this method is needed to contain the "game starter".
     * @param args args is a default variable to write in the main method.
     */
    public static void main(String[] args) {
        Game starter = new Game();
        starter.start();
    }

    /**
     * Game constructor have a variable that stock the input from the players keyboard.
     */
    Game() {
        clavier = new Scanner(System.in);
    }

    /**
     * Start the game, using every dialogue and boards needed.
     */
    public void start() {
        String champ;
        gameStarterMessages();
        classSelector();
        plateau.boardGenerator();
        gameLauncher();
//        if (plateau.getI() <= 64) {
//            playAgain();
//        }
    }

    /**
     * Method that contain all starting dialogs.
     */
    private void gameStarterMessages(){
        System.out.println("\n" + "Bienvenue dans Donjons & Dragons !" + "\n");
        System.out.println("Vous pouvez choisir l'une de ces 2 classes pour pouvoir intégrer la partie :" + "\n" + "\n" + "-> Warrior" + "\n" + "-> Wizard" + "\n");
        System.out.println("Ecrivez le nom de la classe pour la séléctionner, ou quitter pour mettre fin à la session.");
    }

    /**
     * Method that contain the selecting class process for the player.
     */
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

    /**
     * Method that contain all messages to start the game.
     */
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

    /**
     * Method that contain the choice of the player between move or use something.
     */
    private void test() {
        String champ;
        try {
            while (position <= 64) {
                System.out.println("Que voulez-vous vous faire ?");
                System.out.println("Vous pouvez : Lancer votre dé" + "\n");
                System.out.println(position);
//            System.out.println(plateau.getI());
                champ = clavier.nextLine();
                if (champ.equalsIgnoreCase("dé")) {
                    int dice = roundDice.launchDice();
                    position += dice;
                    System.out.println("Dé: " + dice + ": Vous êtes sur la case " + position);
                    plateau.boardMoovement(character, position);
                } else {
                    System.out.println("non");
                }
            }

        } catch (Exception e) {
            System.out.println("ça marche ! (enfin non mais bon...)");;
            playAgain();
        }
    }

    /**
     * Method that stop the game if the player chose it, or if the game has ended.
     */
    private void gameStopper() {
        clavier.close();
        System.out.println("Vous avez mis fin à la partie.");
    }

    /**
     * Method that restart the game.
     */
    private void gameRestarter() {
        start();
    }

    /**
     * Method that ask the player if he wants to play again, or if he won't.
     */
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