import Creatures.Creature;
import Dungeon.Dungeon;
import Dungeon.Room;
import PlayerProperties.Weapon;
import Players.Fighters.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Room room1;
    Room room2;
    Creature creature;
    Creature creature2;
    Warrior warrior;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Bow and Arrow", 150);
        warrior = new Warrior("Terinator",50, weapon);
        creature = new Creature("Dragon",100,100,1);
        creature2 = new Creature("rat",1,1,1);
        room1 = new Room(100,creature);
        room2 = new Room(500, creature2);
        dungeon = new Dungeon();

    }

    @Test
    public void canAddRooms(){
        dungeon.addRoom(room1);
        dungeon.addRoom(room2);
        assertEquals(2, dungeon.countRooms());
    }

    @Test
    public void canChangePosition(){
        dungeon.addRoom(room1);
        dungeon.addRoom(room2);
        dungeon.nextRoom();
        assertEquals(1, dungeon.getPosition());
    }

    @Test
    public void canMovePlayers() {
        dungeon.addRoom(room1);
        room1.addPlayer(warrior);
        dungeon.addRoom(room2);
        dungeon.nextRoom();
        assertEquals(1, room2.countPlayers());

    }

    @Test
    public void canCompleteRoom() {
        dungeon.addRoom(room1);
        room1.addPlayer(warrior);
        dungeon.addRoom(room2);
        warrior.attack(creature);
        dungeon.completeRoom();
        assertEquals(1, room2.countPlayers());
    }
}
