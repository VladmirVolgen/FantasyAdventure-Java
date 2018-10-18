import Creatures.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreatureTest {

    Creature creature;

    @Before
    public void before() {
        creature = new Creature("Dragon", 100, 25, 1);
    }

    @Test
    public void isAlive() {
        assertTrue(creature.getStatus());
    }

    @Test
    public void isNotAlive() {
        creature.takeDamage(101);
        assertEquals(false, creature.getStatus());
    }
}
