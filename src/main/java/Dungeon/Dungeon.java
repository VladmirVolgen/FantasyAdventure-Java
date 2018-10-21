package Dungeon;

import Players.Player;

import java.util.ArrayList;

public class Dungeon {
    private ArrayList<Room> rooms;
    private int position;

    public Dungeon() {
        this.rooms = new ArrayList<>();
        this.position = 0;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }


    public int countRooms() {
        return rooms.size();
    }


    public void nextRoom() {
        movePlayersToRoom();
        position++;
    }

    public int getPosition() {
        return position;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    protected void movePlayersToRoom() {
        ArrayList<Player> players = rooms.get(position).getPlayers();
//        rooms.get(position + 1).addManyPlayers(players);

        Room room = rooms.get(position + 1);
        for (Player player: players) {
            room.addPlayer(player);
        }
        clearRoom();

    }

    protected void clearRoom() {
        rooms.get(position).clearRoom();
    }

    public void completeRoom() {
        Room room = rooms.get(position);
        if (room.canCollectTreasure()) {
            room.playersCollectTreasure();
            nextRoom();
        }
    }
}

