package Characters;

/**
 * All private variables.
 */
public abstract class Character {
    private int Health;
    private int MaxHealth;
    private int Strength;
    private int MaxStrength;
    
    public Character(int Health, int MaxHealth, int Strength, int MaxStrength) {
        this.Health = Health;
        this.MaxHealth = MaxHealth;
        this.Strength = Strength;
        this.MaxStrength = MaxStrength;
    }
    //----------------------------------------------------(Setters)----------------------------------------------------

    /**
     * Setter of Health of the player.
     * @param health int
     */
    public void setHealth(int health) {Health = health;}

    /**
     * Setter of Maximum Health of the player.
     * @param maxHealth int
     */
    public void setMaxHealth(int maxHealth) {MaxHealth = maxHealth;}

    /**
     * Setter of Strength of the player.
     * @param strength int
     */
    public void setStrength(int strength){Strength = strength;}

    /**
     * Setter of Maximum Strength of the player.
     * @param maxStrength int
     */
    public void setMaxStrength(int maxStrength) {MaxStrength = maxStrength;}
    //----------------------------------------------------(Getters)----------------------------------------------------

    /**
     * Getter of Health of the player
     * @return int
     */
    public int getHealth() {return Health;}

    /**
     * Getter of Maximum Health of the player.
     * @return int
     */
    public int getMaxHealth() {return MaxHealth;}

    /**
     * Getter of getStrength of the player.
     * @return int
     */
    public int getStrength() {return Strength;}

    /**
     * Getter of Maximum Strength of the player.
     * @return int
     */
    public int getMaxStrength() {return MaxStrength;}
}
