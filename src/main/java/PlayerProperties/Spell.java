package PlayerProperties;

public class Spell {

    private String name;
    private int damage;
    private int level;

    public Spell(String name, int damage, int level) {
        this.name = name;
        this.damage = damage;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getLevel() { return level; }

}
