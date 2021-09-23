package com.jsaddlercs.vactrac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jsaddlercs.vactrac.service.RoomService;

@Controller
public class RoomController {
	private final RoomService roomService;
	
	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}
	
	/*https://stackoverflow.com/questions/42510898/spring-mvc-make-a-button-upon-click-return-a-string-value*/
	@RequestMapping(value="/rooms", method=RequestMethod.GET)
	public String getAllRooms(Model model) { 
		model.addAttribute("rooms", roomService.getAllRooms());
		return "rooms";
	}
	
	@RequestMapping(value="/roomsSuites", method=RequestMethod.GET) 
	public String getRoomsSuites(Model model) { 
		model.addAttribute("rooms", roomService.getSuites());
		return "rooms";
	}
	
	public String getRoomsUnder100(Model model) { 
		model.addAttribute("rooms", roomService.getRoomsUnder100());
		return "rooms";
	}
//	@GetMapping("/rooms6")
//	public String getRoomsOn6th(Model model) { 
//		model.addAttribute("rooms", roomService.getByStayDate("0906"));
//	}
}
