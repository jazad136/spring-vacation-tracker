package com.jsaddlercs.vactrac.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jsaddlercs.vactrac.model.Room;
@SpringBootTest
public class RoomServiceTest {
	
	private static final Logger logger = LoggerFactory.getLogger(RoomServiceTest.class);
	@Autowired RoomService roomService;
	
	@Test
	public void test_rooms_has_items() {
		logger.debug("**listRooms**");
		List<Room> out = roomService.getAllRooms();
		assertThat(out.size()).isGreaterThan(0);
		logger.debug("**PASSED**");

	}
	@Test
	public void test_rooms_has_laquinta() {
		logger.debug("**listRooms**");
		List<Room> out = roomService.getAllRooms();
		Room item1 = out.get(0);
		assertThat(item1.getName()).isEqualTo("La Quinta Ronks");
		logger.debug("**PASSED**");		
	}
}
