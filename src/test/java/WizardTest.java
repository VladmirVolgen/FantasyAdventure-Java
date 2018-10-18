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

    @Test
//    damage cannot be split.
    public void damageCanKillWizardAndCreature() {
        creature.attack(wizard);
        creature.attack(wizard);
        creature.attack(wizard);
        creature.attack(wizard);
        assertEquals(-10, wizard.getHp());
    }

    @Test
    public void wizardCanAttack() {
        wizard.attack(creature);
        assertEquals(85, creature.getHp());
    }

    @Test
    public void canChangeSpell() {
        wizard.setSpell(spell2);
        wizard.attack(creature);
        assertEquals(90, creature.getHp());
    }
}
