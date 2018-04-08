package com.bku.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bku.roomie.dto.FullUserInfoDTO;
import com.bku.roomie.dto.UserDTO;
import com.bku.roomie.entity.User;

@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );
	public User toEntity(UserDTO userDTO);

	public UserDTO toDTO(User user);
	
	public FullUserInfoDTO toFullDTO(User user);
}
