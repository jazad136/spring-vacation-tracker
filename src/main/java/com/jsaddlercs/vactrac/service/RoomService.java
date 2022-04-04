package com.jsaddlercs.vactrac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsaddlercs.vactrac.dao.CostDAO;
import com.jsaddlercs.vactrac.dao.RoomsOnlyDAO;
import com.jsaddlercs.vactrac.model.Room;
import com.jsaddlercs.vactrac.model.RoomCost;

@Service
public class RoomService {
	
	private final RoomsOnlyDAO roomsDAO;
	private final CostDAO costDAO;
	
	public RoomService(RoomsOnlyDAO roomsDAO, CostDAO costDAO) {
		this.roomsDAO = roomsDAO;
		this.costDAO = costDAO;
	}

	public List<Room> getAllRooms() { 
		return roomsDAO.getAllRooms();
	}
	
	public List<RoomCost> getAllRoomsWCosts() { 
		return costDAO.getAllRoomsWCosts();
	}

	public RoomCost getRoomCostInfo(long roomId) { 
		return costDAO.findById(roomId);
	}
	public RoomCost addNewCost(long roomId, double price) {
		return costDAO.createRoomCost(roomId, price);
	}
	
}
