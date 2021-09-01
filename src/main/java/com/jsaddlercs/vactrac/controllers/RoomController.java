package com.jsaddlercs.vactrac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsaddlercs.vactrac.service.RoomService;

@Controller
@RequestMapping("/rooms")
public class RoomController {
	private final RoomService roomService;
	
	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@GetMapping
	public String getAllRooms(Model model) { 
		model.addAttribute("rooms", roomService.getAllRooms());
		return "rooms";
	}
	
//	@GetMapping("/rooms6")
//	public String getRoomsOn6th(Model model) { 
//		model.addAttribute("rooms", roomService.getByStayDate("0906"));
//	}
}
