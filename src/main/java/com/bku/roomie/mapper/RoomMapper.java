package com.bku.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bku.roomie.dto.RoomDTO;
import com.bku.roomie.entity.Room;

@Mapper(uses = {ImageMapper.class, UserMapper.class, LocationMapper.class})
public interface RoomMapper {
	RoomMapper INSTANCE = Mappers.getMapper( RoomMapper.class );
	public Room toEntity(RoomDTO roomDTO);

	public RoomDTO toDTO(Room room);
}
