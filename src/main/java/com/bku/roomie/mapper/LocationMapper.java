package com.bku.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bku.roomie.dto.LocationDTO;
import com.bku.roomie.entity.Location;

@Mapper
public interface LocationMapper {
	LocationMapper INSTANCE = Mappers.getMapper( LocationMapper.class );
	public Location toEntity(LocationDTO locationDTO);

	public LocationDTO toDTO(Location location);
}
