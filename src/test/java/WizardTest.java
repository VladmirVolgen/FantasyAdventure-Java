import Creatures.Creature;
import Interfaces.IDefend;
import PlayerProperties.Spell;
import Players.Magicals.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Creature creature;
    Creature creature2;
    Spell spell;
    Spell spell2;

    @Before
    public void before() {
        creature = new Creature("Griffin", 100, 30, 1);
        creature2 = new Creature("Bear", 80, 20, 1);
        spell = new Spell("Thunderbolt", 5, 3);
        spell2 = new Spell("FireBall", 10, 1);
        wizard = new Wizard("Merlin", 20, spell, creature2);
    }

    @Test
    public void creatureCanAttack () {
        wizard.creatureAttack(creature);
        assertEquals(80, creature.getHp());
    }
}
