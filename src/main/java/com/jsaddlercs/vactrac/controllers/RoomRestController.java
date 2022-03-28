package com.jsaddlercs.vactrac.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsaddlercs.vactrac.model.Room;
import com.jsaddlercs.vactrac.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
	private final RoomService roomService;
	private final JdbcTemplate jdbcTemplate;
	
	private final String GET_ALL_ROOM = " SELECT room_id, name, bed_info, nights, stay_start FROM room;";
	private static int idxLngRoomId = 1;
	private static int idxStrName = 2;
	private static int idxStrBedInfo = 3;
	private static int idxIntNights = 4;
	private static int idxStrStayStart = 5;
	
	/* sample output
 (1)                   (2)                 (3)        (4)      (5) 
 room_id |             name              | bed_info | nights | stay_start
---------+-------------------------------+----------+--------+------------
       1 | La Quinta Ronks               | 2Q       |      2 | 0328
       2 | La Quinta Ronks               | 1K       |      2 | 0328
	 */
	public RoomRestController(RoomService roomService, JdbcTemplate jdbcTemplate) {
		this.roomService = roomService;
		this.jdbcTemplate = jdbcTemplate;
	}
	

	@GetMapping
	public List<Room> getAllRooms() { 
		List<Room> roomList = new ArrayList<>();
		SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_ALL_ROOM);
		Room r = null;
		while(rs.next()) { 
			r = new Room();
			r.setId(rs.getLong(idxLngRoomId));
			r.setName(rs.getString(idxStrName));
			r.setBedInfo(rs.getString(idxStrBedInfo));
			r.setNights(rs.getInt(idxIntNights));
			r.setStayStart(rs.getString(idxStrStayStart));
			roomList.add(r);
		}
		return roomList;
	}
	
	@GetMapping(path="/indexcosts")
	public List<Room> getAllRoomsWCosts() { 
		List<Room> roomList = new ArrayList<>();
		SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_ALL_ROOM);
		Room r = null;
		while(rs.next()) { 
			r = new Room();
			r.setId(rs.getLong(idxLngRoomId));
			r.setName(rs.getString(idxStrName));
			r.setBedInfo(rs.getString(idxStrBedInfo));
			r.setNights(rs.getInt(idxIntNights));
			roomList.add(r);
		}
		return roomList;
	}
	
	
}
