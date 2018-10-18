package Players.Healers;

import Interfaces.IDefend;
import PlayerProperties.HealingTool;
import Players.Player;

public abstract class Healer extends Player {

    private HealingTool healingTool;

    public Healer(String name, int hp, HealingTool healingTool) {
        super(name, hp);
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public void restoreHp(int amount, Player player) {
        if(player.getHp() + amount > player.getOriginalHp()) player.setHp(player.getOriginalHp());
        else{
        player.setHp(player.getHp() + amount);
        }
    }

    @Override
    public int getDamage() {
        return 1;
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
