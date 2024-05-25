package com.depotgenius.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.depotgenius.dtos.user.ChangePasswordRequest;
import com.depotgenius.dtos.user.CreateUserRequest;
import com.depotgenius.dtos.user.DeleteUserRequest;
import com.depotgenius.dtos.user.UpdateUserRequest;
import com.depotgenius.entities.concretes.Role;
import com.depotgenius.entities.concretes.User;

public interface UserService{
    
	User create(CreateUserRequest createUserRequest);
		
	User update(UpdateUserRequest updateUserRequest);
		
	void delete (DeleteUserRequest deleteUserRequest);  
	
	String getUserRole(User user);
	
	User getUser(UUID userId);
	
	boolean changePassword(ChangePasswordRequest changePasswordRequest);

	List<Role> getAllRoles();
}
