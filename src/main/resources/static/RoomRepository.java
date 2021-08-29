package com.jsaddlercs.vactrac.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsaddlercs.vactrac.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
	
}
