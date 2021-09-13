package com.jsaddlercs.vactrac.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jsaddlercs.vactrac.data.RoomRepository;
import com.jsaddlercs.vactrac.model.Room;

@Service
public class RoomService {

//	private static final List<Room> rooms = new ArrayList<>();
//    static{
//        for(long i = 0; i < 3; i++){
//            rooms.add(new Room(i, "Baymont Mackinaw City","2Q", 2, 159.00, "0831"));
//        }
//    	int i = 1;
//    	rooms.add(new Room(i, "Baymont Mackinaw City","2Q", 2, 159.00));
//    	i++;
//    	rooms.add(new Room(i, "Baymont Mackinaw City","2Q", 2, 159.00));
//    	i++;
//    	rooms.add(new Room(i, "Baymont Mackinaw City","2Q", 2, 159.00));
    	
//    }

//    public List<Room> getAllRooms(){
//        return rooms;
//    }
	private final RoomRepository roomRepository;

	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	public List<Room> getAllRooms() { 
		return roomRepository.findAll();
	}
	public List<Room> getAugust30Rooms() { 
		return roomRepository.findByDateOfStay("0830");
	}
	public List<Room> getSeptember06Rooms() { 
		LinkedList<Room> output = new LinkedList<>();
		output.addAll(roomRepository.findByDateOfStay("0906"));		
		output.addAll(roomRepository.findByDateOfStay("0908"));
		return output;
	}
	
	
}
