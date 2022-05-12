package Characters;
public abstract class Character {
    private String Name;
    private int Health;
    private int MaxHealth;
    private int Strength;
    private int MaxStrength;
    //----------------------------------------------------(Setters)----------------------------------------------------
    public void setName(String name) {
        Name = name;
    }
    public void setHealth(int health) {
        Health = health;
    }
    public void setMaxHealth(int maxHealth) {
        MaxHealth = maxHealth;
    }
    public void setStrength(int strength) {
        Strength = strength;
    }
    public void setMaxStrength(int maxStrength) {
        MaxStrength = maxStrength;
    }
    //----------------------------------------------------(Getters)----------------------------------------------------
    public String getName() {return Name;}
    public int getHealth() {return Health;}
    public int getMaxHealth() {return MaxHealth;}
    public int getStrength() {return Strength;}
    public int getMaxStrength() {return MaxStrength;}
    public Character(int Health, int MaxHealth, int Strength, int MaxStrength) {
        this.Health = Health;
        this.MaxHealth = MaxHealth;
        this.Strength = Strength;
        this.MaxStrength = MaxStrength;
    }
}

