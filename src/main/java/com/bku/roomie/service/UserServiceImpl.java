package com.bku.roomie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bku.roomie.dal.UserDAO;
import com.bku.roomie.dto.FullUserInfoDTO;
import com.bku.roomie.dto.UserDTO;
import com.bku.roomie.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public FullUserInfoDTO getUserDetailBy(Long userID) {
		return UserMapper.INSTANCE.toFullDTO(userDAO.findById(userID).orElse(null));
	}

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		//kiem tra xem thang user co ton tai chua?
		//to do
		return UserMapper.INSTANCE.toDTO(userDAO.save(UserMapper.INSTANCE.toEntity(userDTO)));
	}

}
