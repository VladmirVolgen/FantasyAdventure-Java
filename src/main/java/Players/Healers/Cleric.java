package Players.Healers;

import Interfaces.IDefend;
import PlayerProperties.HealingTool;

public class Cleric extends Healer{
    public Cleric(String name, int hp, HealingTool healingTool) {
        super(name, hp, healingTool);
    }
}
