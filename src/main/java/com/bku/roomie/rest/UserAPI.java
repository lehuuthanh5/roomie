package com.bku.roomie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bku.roomie.dto.FullUserInfoDTO;
import com.bku.roomie.dto.UserDTO;
import com.bku.roomie.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserAPI {
	
	@Autowired
	private UserService userService;

	@ApiOperation(value = "Get user by ID")
	@GetMapping("/api/user/{userID}")
	public ResponseEntity<FullUserInfoDTO> getUser(@PathVariable Long userID) {
		return ResponseEntity.ok(userService.getUserDetailBy(userID));
	}
	
	@ApiOperation("Create User")
	@PostMapping("/api/user")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) {
		return ResponseEntity.ok(userService.createUser(user));
	}
}
