package Dungeon;

import Creatures.Creature;
import Players.Fighters.Warrior;
import Players.Player;

import java.util.ArrayList;

public class Room {
    private int treasure;
    private Creature creature;
    private ArrayList<Player>players;

    public Room(int treasure, Creature creature){
        this.treasure = treasure;
        this.creature = creature;
        this.players = new ArrayList<>();
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


    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addManyPlayers(ArrayList<Player> players){
        this.players = players;

    }
    public void clearRoom(){
        players.clear();
    }

    public int countPlayers() {
        return players.size();
    }

    public ArrayList getPlayers(){
        return players;
    }

    public void playersCollectTreasure() {
        if(canCollectTreasure()){
            for (Player player: players) {
                player.addMoney(treasure/countPlayers());

            }
        }
    }


}
