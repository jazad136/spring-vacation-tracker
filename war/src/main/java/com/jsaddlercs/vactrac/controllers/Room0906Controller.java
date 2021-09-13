package com.jsaddlercs.vactrac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsaddlercs.vactrac.service.RoomService;

@Controller
//@RequestMapping("/rooms")
//@RequestMapping("/rooms0830")
@RequestMapping("/rooms0906")
public class Room0906Controller {
	private final RoomService roomService;
	
	public Room0906Controller(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@GetMapping
	public String getAllRooms(Model model) { 
		model.addAttribute("rooms", roomService.getSeptember06Rooms());
		return "rooms";
	}
}
