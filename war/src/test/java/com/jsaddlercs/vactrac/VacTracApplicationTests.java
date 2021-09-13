package com.jsaddlercs.vactrac;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jsaddlercs.vactrac.data.RoomRepository;
import com.jsaddlercs.vactrac.model.Room;

@RunWith(SpringRunner.class)
@SpringBootTest
class VacTracApplicationTests {

	@Autowired public RoomRepository roomRepository;
	
	@Test
	public void stayByDateTest() { 
		System.out.println("Find rooms by stayDate");
		List<Room> sep06 = roomRepository.findByDateOfStay("0906");
		sep06.forEach(System.out::println);
	}

	@BeforeEach
    @AfterEach
    public void printBanner() {
        System.out.println("*************************************************************************************");
    }
}
