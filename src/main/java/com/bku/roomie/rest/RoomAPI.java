package com.bku.roomie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bku.roomie.dto.RoomDTO;
import com.bku.roomie.service.RoomService;

@RestController
public class RoomAPI {
	@Autowired
	private RoomService roomService;
	
	@PostMapping("/api/room")
	public ResponseEntity<RoomDTO> createRoom(@RequestBody RoomDTO room) {
		return ResponseEntity.ok(roomService.createRoom(room));
	}
}
