import Creatures.Creature;
import PlayerProperties.Weapon;
import Players.Fighters.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Weapon weapon;
    Creature creature;

    @Before
    public void before() {
        creature = new Creature("Bat", 20, 5, 1);
        weapon = new Weapon("Axe", 10);
        warrior = new Warrior("Boromir", 50, weapon);
    }

    @Test
    public void canAttack() {
        warrior.attack(creature);
        assertEquals(10, creature.getHp());
    }

    @Test
    public void canBeAttackedByCreature() {
        creature.attack(warrior);
        assertEquals(45, warrior.getHp());
    }
}
