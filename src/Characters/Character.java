package Characters;

/**
 * All private variables.
 */
public abstract class Character {
    private int Health;
    private int MaxHealth;
    private int Strength;
    private int MaxStrength;

    /**
     * Here's the parameters of the constructor below.
     * @param Health int Health responsible to manage the Health of the player.
     * @param MaxHealth int MaxHealth responsible to manage the Maximum Health of the player.
     * @param Strength int Strength responsible to manage the Strength of the player.
     * @param MaxStrength int MaxStrength responsible to manage the Maximum Strength of the player.
     */
    public Character(int Health, int MaxHealth, int Strength, int MaxStrength) {
        this.Health = Health;
        this.MaxHealth = MaxHealth;
        this.Strength = Strength;
        this.MaxStrength = MaxStrength;
    }
    //----------------------------------------------------(Setters)----------------------------------------------------

    /**
     * Setter of Health of the player.
     * @param health int Health
     */
    public void setHealth(int health) {Health = health;}

    /**
     * Setter of Maximum Health of the player.
     * @param maxHealth int MaxHealth
     */
    public void setMaxHealth(int maxHealth) {MaxHealth = maxHealth;}

    /**
     * Setter of Strength of the player.
     * @param strength int Strength
     */
    public void setStrength(int strength){Strength = strength;}

    /**
     * Setter of Maximum Strength of the player.
     * @param maxStrength int MaxStrength
     */
    public void setMaxStrength(int maxStrength) {MaxStrength = maxStrength;}
    //----------------------------------------------------(Getters)----------------------------------------------------

    /**
     * Getter of Health of the player
     * @return int getHealth.
     */
    public int getHealth() {return Health;}

    /**
     * Getter of Maximum Health of the player.
     * @return int getMaxHealth.
     */
    public int getMaxHealth() {return MaxHealth;}

    /**
     * Getter of getStrength of the player.
     * @return int getStrength.
     */
    public int getStrength() {return Strength;}

    /**
     * Getter of Maximum Strength of the player.
     * @return int getMaxStrength.
     */
    public int getMaxStrength() {return MaxStrength;}
}
