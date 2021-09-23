package com.jsaddlercs.vactrac.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsaddlercs.vactrac.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

	List<Room> findByBedInfoLike(String string);

	List<Room> findByCostLessThan(double d);
}
