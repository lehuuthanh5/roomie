package com.bku.roomie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bku.roomie.dal.RoomDAO;
import com.bku.roomie.dto.RoomDTO;
import com.bku.roomie.mapper.RoomMapper;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomDAO roomDAO;
	@Override
	public RoomDTO createRoom(RoomDTO roomDTO) {
		return RoomMapper.INSTANCE.toDTO(roomDAO.save(RoomMapper.INSTANCE.toEntity(roomDTO)));
	}
	
}
