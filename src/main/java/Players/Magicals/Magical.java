package Players.Magicals;

import Creatures.Creature;
import Interfaces.IAttack;
import Interfaces.IDefend;
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

    public void invoke(Creature creature) {
        this.creature = creature;
    }

    @Override
    public int getDamage() {
        return spell.getDamage();
    }

    @Override
    public void attack(IDefend target) {
        target.defend(getDamage());
    }

    @Override
    public void defend(int damage) {
        if (creature.getStatus()) creature.takeDamage(damage);
        else{
        super.takeDamage(damage);
        }
    }

    public void creatureAttack(IDefend target) {
        creature.attack(target);
    }

    public void study() {
        spell.levelUp();
    }
}
