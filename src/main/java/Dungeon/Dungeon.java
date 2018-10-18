package Dungeon;

import java.util.ArrayList;

public class Dungeon {
    private ArrayList<Room>rooms;
    private int position;

    public Dungeon(){
        this.rooms = new ArrayList<>();
        this.position = 0;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }


    public int countRooms() {
        return rooms.size();
    }


    public void nextRoom() {
        position ++;
    }

    public int getPosition() {
        return position;
    }
}
