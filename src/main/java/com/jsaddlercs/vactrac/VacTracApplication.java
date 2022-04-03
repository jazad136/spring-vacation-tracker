package com.jsaddlercs.vactrac;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.jsaddlercs.vactrac.dao.RoomsOnlyDAO;
import com.jsaddlercs.vactrac.model.Room;


@SpringBootApplication
public class VacTracApplication implements CommandLineRunner {

	@Autowired JdbcTemplate jdbcTemplate;
	@Autowired RoomsOnlyDAO roomDAO;
	public static void main(String[] args) {
		SpringApplication.run(VacTracApplication.class, args);
	}

	private static final Logger LOG = LoggerFactory.getLogger(VacTracApplication.class);
	
	public void run(String... args) throws Exception {
		
		List<Room> roomResult = roomDAO.getAllRooms();
		roomResult.forEach(System.out::println);
//		String sql = "SELECT 1;";         
//        SqlRowSet srs = jdbcTemplate.queryForRowSet(sql);
//        srs.next();
//        LOG.info("Queried and got " + srs.getInt(1));
		
    }
}
