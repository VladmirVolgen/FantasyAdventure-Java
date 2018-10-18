import Creatures.Creature;
import PlayerProperties.HealingTool;
import PlayerProperties.Weapon;
import Players.Fighters.Warrior;
import Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Creature creature;
    Warrior warrior;
    Weapon  weapon;
    HealingTool healingTool;

    @Before
    public void before() {
        creature = new Creature("Rat", 20, 5, 5);
        weapon = new Weapon("Stick", 3);
        healingTool = new HealingTool("Potion", 20);
        warrior = new Warrior("Conan", 100, weapon);
        cleric = new Cleric("Mike", 50, healingTool);
    }

    @Test
    public void canHealItSelf() {
        creature.attack(cleric);
        assertEquals(25, cleric.getHp());
        cleric.restoreHp(cleric.getHealingTool().getHealPower(), cleric);
        assertEquals(45, cleric.getHp());
    }

    @Test
    public void cannotOverHeal() {
        creature.attack(warrior);
        assertEquals(75, warrior.getHp());
        cleric.restoreHp(cleric.getHealingTool().getHealPower(), warrior);
        cleric.restoreHp(cleric.getHealingTool().getHealPower(), warrior);
        assertEquals(100, warrior.getHp());
    }
}
