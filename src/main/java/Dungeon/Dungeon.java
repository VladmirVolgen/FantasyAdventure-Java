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

    public void movePlayersToRoom() {
        ArrayList<Player> players = rooms.get(position).getPlayers();
//        clearRoom();
        rooms.get(position + 1).addManyPlayers(players);

    }

    protected void clearRoom() {
        rooms.get(position).clearRoom();
    }
}

