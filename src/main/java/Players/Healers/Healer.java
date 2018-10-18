package Players.Healers;

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
}
