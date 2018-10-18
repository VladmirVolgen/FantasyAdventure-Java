package Players.Fighters;

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
}
