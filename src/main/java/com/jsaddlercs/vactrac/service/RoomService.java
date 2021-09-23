package com.jsaddlercs.vactrac.service;

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
	public List<Room> getSuites() { 
		return roomRepository.findByBedInfoLike("%S");
	}

	public List<Room> getRoomsUnder100() {
		return roomRepository.findByCostLessThan(100.00);
	}
}
