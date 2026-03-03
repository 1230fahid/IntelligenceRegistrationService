package com.intelligence.registration.service.user;

import com.intelligence.registration.model.dto.user.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private CreateUserRequest createUserRequest;
	private DeleteUserRequest deleteUserRequest;
	private ReadUserRequest readUserRequest;
	private UpdateUserRequest updateUserRequest;

	public UserService(CreateUserRequest createUserRequest, DeleteUserRequest deleteUserRequest,
			ReadUserRequest readUserRequest, UpdateUserRequest updateUserRequest) {
		this.createUserRequest = createUserRequest;
		this.deleteUserRequest = deleteUserRequest;
		this.readUserRequest = readUserRequest;
		this.updateUserRequest = updateUserRequest;
	}

}