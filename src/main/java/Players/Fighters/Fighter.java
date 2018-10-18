package Players.Fighters;

import Interfaces.IDefend;
import PlayerProperties.Weapon;
import Players.Player;

public abstract class Fighter extends Player {

    private Weapon weapon;

    public Fighter(String name, int hp, Weapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int getDamage() {
        return weapon.getDamage();
    }

    @Override
    public void attack(IDefend target) {
        target.defend(getDamage());
    }

    @Override
    public void defend(int damage) {
        super.takeDamage(damage);
    }
}
