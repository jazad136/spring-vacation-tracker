package com.jsaddlercs.vactrac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsaddlercs.vactrac.service.RoomService;

@Controller
//@RequestMapping("/rooms")
//@RequestMapping("/rooms0830")
@RequestMapping("/rooms0830")
public class Room0830Controller {
	private final RoomService roomService;
	
	public Room0830Controller(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@GetMapping
	public String getAllRooms(Model model) { 
		model.addAttribute("rooms", roomService.getAugust30Rooms());
		return "rooms";
	}
	
	
//	@GetMapping("/rooms6")
//	public String getRoomsOn6th(Model model) { 
//		model.addAttribute("rooms", roomService.getByStayDate("0906"));
//	}
}
