package Creatures;

public class Creature {

    private String name;
    private int hp;
    private int damage;
    private int level;

    public Creature(String name, int hp, int damage, int level) {
        this.name = name;
        this.hp = hp * level;
        this.damage = damage * level;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getLevel() {
        return level;
    }
}
