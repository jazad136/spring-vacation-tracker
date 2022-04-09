package com.jsaddlercs.vactrac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.jsaddlercs.vactrac.model.Room;
import com.jsaddlercs.vactrac.model.RoomCost;

@Component
public class RoomsOnlyDAO {

	public JdbcTemplate jdbcTemplate;
	private final String GET_ALL_ROOM = "SELECT room_id, name, bed_info, nights, stay_start FROM room;";
	
	private final String GET_ONE = 
			"SELECT room_id, name, bed_info, nights, stay_start FROM room WHERE room_id = ?;";

	/* sample output
	 (1)                   (2)                 (3)        (4)      (5) 
	 room_id |             name              | bed_info | nights | stay_start
	---------+-------------------------------+----------+--------+------------
      1 | La Quinta Ronks               | 2Q       |      2 | 0328
      2 | La Quinta Ronks               | 1K       |      2 | 0328
	 */
	public RoomsOnlyDAO(JdbcTemplate template) { 
		this.jdbcTemplate = template;
	}
	
	private static int idxLngRoomId = 1;
	private static int idxStrName = 2;
	private static int idxStrBedInfo = 3;
	private static int idxIntNights = 4;
	private static int idxStrStayStart = 5;
	


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
	
	private static int idxWCLngRoomId = 1;
	private static int idxWCStrName = 2;
	private static int idxWCStrBedInfo = 3;
	private static int idxWCIntNights = 4;
	private static int idxWCStrStayStart = 5;
	
	public List<Room> getAllRoomsWCosts() { 
		List<Room> roomList = new ArrayList<>();
		SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_ALL_ROOM);
		Room r = null;
		while(rs.next()) { 
			r = new Room();
			r.setId(rs.getLong         (idxWCLngRoomId));
			r.setName(rs.getString     (idxWCStrName));
			r.setBedInfo(rs.getString  (idxWCStrBedInfo));
			r.setNights(rs.getInt      (idxWCIntNights));
			r.setStayStart(rs.getString(idxWCStrStayStart));
		
			roomList.add(r);
		}
		return roomList;
	}

	private static class RoomMapper implements RowMapper<Room> {
		@Override
		public Room mapRow(ResultSet rs, int rowNum) throws SQLException {
			Room r = new Room();
			r.setId(rs.getLong(idxLngRoomId));
			r.setName(rs.getString(idxStrName));
			r.setBedInfo(rs.getString(idxStrBedInfo));
			r.setNights(rs.getInt(idxIntNights));
			r.setStayStart(rs.getString(idxStrStayStart));
			return r;
		}
		
	}
	
	public Room findById(long id) { 
		return jdbcTemplate.queryForObject(GET_ONE, new RoomMapper(), id);
	}
}
