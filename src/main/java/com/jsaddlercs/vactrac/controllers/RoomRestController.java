package com.jsaddlercs.vactrac.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsaddlercs.vactrac.model.Room;
import com.jsaddlercs.vactrac.model.RoomCost;
import com.jsaddlercs.vactrac.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
	private final RoomService roomService;

	public RoomRestController(RoomService roomService) {
		this.roomService = roomService;
	}
	

	@CrossOrigin
	@GetMapping
	public List<Room> getAllRooms() { 
		return roomService.getAllRooms();
	}
	
	@CrossOrigin
	@GetMapping(path="/wcosts")
	public List<RoomCost> getRoomsWCosts() { 
		return roomService.getAllRoomsWCosts();
	}	
}
