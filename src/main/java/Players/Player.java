package Players;

import Interfaces.IAttack;
import Interfaces.IDefend;

public abstract class Player implements IAttack, IDefend {

    private String name;
    private int hp;
    private boolean status;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
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
}
