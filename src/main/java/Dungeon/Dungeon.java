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

    public void completeRoom() {
        Room room = rooms.get(position);
        if (room.canCollectTreasure()) {
            room.playersCollectTreasure();
            nextRoom();
        }
    }

    // helpers

    private void movePlayersToRoom() {
        ArrayList<Player> players = rooms.get(position).getPlayers();

        Room room = rooms.get(position + 1);
        room.addManyPlayers(players);
        clearRoom();

    }

    private void clearRoom() {
        rooms.get(position).clearRoom();
    }
}

