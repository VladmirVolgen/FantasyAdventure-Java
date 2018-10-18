package Creatures;

import Interfaces.IAttack;
import Interfaces.IDefend;

public class Creature implements IAttack, IDefend {

    private String name;
    private int hp;
    private int damage;
    private int level;
    private boolean status;

    public Creature(String name, int hp, int damage, int level) {
        this.name = name;
        this.hp = hp * level;
        this.damage = damage * level;
        this.level = level;
        this.status = true;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean getStatus() { return status;}

    public void isAlive() {
        if(hp <= 0) status = false;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            hp -= damage;
            isAlive();
        }
    }

    public int getDamage() {
        return damage;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void attack(IDefend target) {
        target.defend(getDamage());
    }

    @Override
    public void defend(int damage) {
        takeDamage(damage);
    }
}
