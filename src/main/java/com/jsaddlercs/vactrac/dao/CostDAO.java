package com.jsaddlercs.vactrac.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.jsaddlercs.vactrac.model.CostLine;
import com.jsaddlercs.vactrac.model.RoomCost;

@Component
public class CostDAO {

	public JdbcTemplate jdbcTemplate;
	
	private final String GET_ALL_ROOM_COST = 
			"SELECT r.room_id, r.name, "
			+ "r.bed_info, r.nights, r.stay_start, "
			+ "c.price, c.retrieved_date FROM room r "
			+ "join cost c on r.name=c.name "
			+ "and r.bed_info=c.bed_info ORDER BY r.room_id;";
	
	private final String GET_ONE_ROOM_COST = 
			"SELECT r.room_id, r.name, "
			+ "r.bed_info, r.nights, r.stay_start, "
			+ "c.price, c.retrieved_date FROM room r "
			+ "join cost c on r.name=c.name "
			+ "and r.bed_info=c.bed_info WHERE r.room_id=? ORDER BY c.retrieved_date";
	/*
   1               2             3           4        5          6            7 
 room_id |      name       | bed_info | nights | stay_start | price  |   retrieved_date
---------+-----------------+----------+--------+------------+--------+---------------------
    1000 | La Quinta Ronks | 2Q       |      2 | 0328       | 119.00 | 2022-03-19 00:00:00
    1000 | La Quinta Ronks | 2Q       |      2 | 0328       | 149.00 | 2022-03-21 00:00:00
    1000 | La Quinta Ronks | 2Q       |      2 | 0328       | 134.00 | 2022-03-21 00:00:00
    1000 | La Quinta Ronks | 2Q       |      2 | 0328       | 119.00 | 2022-03-21 00:00:00
    ...
	 */
	private static int idxLngRoomId = 1;
	private static int idxStrName = 2;
	private static int idxStrBedInfo = 3;
	private static int idxIntNights = 4;
	private static int idxStrStayStart = 5;
	private static int idxDblPrice = 6;
	private static int idxDatRetrievedDate = 7;
	
	public CostDAO(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; } 
	
	private ResultSetExtractor<RoomCost> roomCostExtract = new RoomCostExtractor();
	
	public RoomCost findById(long id) { 
		SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_ONE_ROOM_COST, id);
		RoomCost cost = null;
		long localRoomId = -1;
		while(rs.next()) { 
			if(localRoomId == -1) { 
				localRoomId = rs.getLong(idxLngRoomId);
				cost = new RoomCost();
				cost.setRoomId(localRoomId);
				cost.setName(rs.getString(idxStrName));
				cost.setBedInfo(rs.getString(idxStrBedInfo));
				cost.setCostLines(new ArrayList<>());
			}
			CostLine cl = new CostLine();
			cl.setNights(rs.getInt(idxIntNights));
			cl.setPrice(rs.getBigDecimal(idxDblPrice));
			cl.setRetrievedDate(new Date(rs.getDate(idxDatRetrievedDate).getTime()));
			cost.getCostLines().add(cl);
		}
		return cost;
	}
	public List<RoomCost> getAllRoomsWCosts() { 
		List<RoomCost> roomCostList = new ArrayList<>();
		SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_ALL_ROOM_COST);
		RoomCost c = null;
		long roomId = -1;
		while(rs.next()) { 
			long localRoomId = rs.getLong(idxLngRoomId);
			if(localRoomId != roomId) { 
				roomCostList.add(c);
				c = new RoomCost();
				c.setRoomId(localRoomId);
				c.setName(rs.getString(idxStrName));
				c.setBedInfo(rs.getString(idxStrBedInfo));
				roomId = localRoomId;
				c.setCostLines(new ArrayList<>());
			}
			CostLine cl = new CostLine();
			cl.setNights(rs.getInt(idxIntNights));
			cl.setStayStart(rs.getString(idxStrStayStart));
			cl.setPrice(new BigDecimal(rs.getDouble(idxDblPrice)));
			cl.setRetrievedDate(new Date(rs.getDate(idxDatRetrievedDate).getTime()));
			c.getCostLines().add(cl);
		}
		roomCostList.add(c);
		return roomCostList;
	}

	public RoomCost createRoomCost(long roomId, double price) {
		RoomCost toReturn = new RoomCost();
		return toReturn;
	}
	private static class RoomCostExtractor implements ResultSetExtractor<RoomCost> {
		private static int idxLngRoomId = 1;
		private static int idxStrName = 2;
		private static int idxStrBedInfo = 3;
		private static int idxIntNights = 4;
		private static int idxStrStayStart = 5;
		private static int idxDblPrice = 6;
		private static int idxDatRetrievedDate = 7;
		@Override
		public RoomCost extractData(ResultSet rs) throws SQLException, DataAccessException {
			RoomCost cost = new RoomCost();
			long roomId = -1;
			while(rs.next()) { 
				long localRoomId = rs.getLong(idxLngRoomId);
				if(localRoomId != roomId) { 
					cost.setRoomId(localRoomId);
					localRoomId = roomId;
					cost.setBedInfo(rs.getString(idxStrBedInfo));
					cost.setName(rs.getString(idxStrName));
					cost.setCostLines(new ArrayList<>());
				}
				CostLine cl = new CostLine();
				cl.setNights(rs.getInt(idxIntNights));
				cl.setStayStart(rs.getString(idxStrStayStart));
				cl.setPrice(new BigDecimal(rs.getDouble(idxDblPrice)));
				cl.setRetrievedDate(new Date(rs.getDate(idxDatRetrievedDate).getTime()));
				cost.getCostLines().add(cl);
			}
			return cost;
		} 
		
	}
	
}
