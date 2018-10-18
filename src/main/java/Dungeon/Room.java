package Dungeon;

import Creatures.Creature;

public class Room {
    private int treasure;
    private Creature creature;

    public Room(int treasure, Creature creature){
        this.treasure = treasure;
        this.creature = creature;
    }

    public int getTreasure() {
        return treasure;
    }

    public Creature getCreature() {
        return creature;
    }

    public boolean canCollectTreasure(){
        if(!creature.getStatus()){
            return true;
        }
        return false;
    }

}
