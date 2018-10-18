package Players;

import Interfaces.IAttack;
import Interfaces.IDefend;

public abstract class Player implements IAttack, IDefend {

    private String name;
    private int hp;
    private int originalHp;
    private boolean status;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.status = true;
        this.originalHp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public int getOriginalHp() {
        return originalHp;
    }
}
