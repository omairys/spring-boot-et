package com.omairys.lil.sbet.landon.roomwebapp.service;

import com.omairys.lil.sbet.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private static final List<Room> rooms= new ArrayList();

    static {
        for (int i=0; i<10; i++){
            rooms.add(new Room(i, "Room"+i, "R"+i, "Q"));
        }
    }

    public  List<Room> getAllRooms(){ return rooms; }
}
