package Weapons;

public abstract class Arme {
    private String name;
    private int strength;
    private String info;
    //----------------------------------------------------(Setters)----------------------------------------------------
    public void setStrength(int strength) {this.strength = strength;}
    public void setName(String name) {this.name = name;}
    public void setInfo(String info) {this.info = info;}
    //----------------------------------------------------(Getters)----------------------------------------------------
    public int getStrength() {return strength;}
    public String getName() {return name;}
    public String getInfo() {return info;}
    //----------------------------------------------------(Methods)----------------------------------------------------
    public Arme(String name, int strength, String info) {
        this.name = name;
        this.strength = strength;
        this.info = info;
    }
}
