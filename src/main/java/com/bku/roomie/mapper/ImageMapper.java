package com.bku.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bku.roomie.dto.ImageDTO;
import com.bku.roomie.entity.Image;

@Mapper
public interface ImageMapper {
	ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

	public Image toEntity(ImageDTO imageDTO);

	public ImageDTO toDTO(Image image);
}
