package com.bku.roomie.service;

import com.bku.roomie.dto.FullUserInfoDTO;
import com.bku.roomie.dto.UserDTO;

public interface UserService {
	public FullUserInfoDTO getUserDetailBy(Long userID);
	public UserDTO createUser(UserDTO userDTO);
}
