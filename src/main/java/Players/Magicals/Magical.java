package Players.Magicals;

import Creatures.Creature;
import PlayerProperties.Spell;
import Players.Player;

public abstract class Magical extends Player {

    private Spell spell;
    private Creature creature;

    public Magical(String name, int hp, Spell spell, Creature creature) {
        super(name, hp);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}
