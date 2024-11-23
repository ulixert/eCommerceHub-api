package com.ulixert.ecommercehub.service;

import com.ulixert.ecommercehub.dto.UserDTO.UserDTO;
import com.ulixert.ecommercehub.dto.UserDTO.UserRegistrationDTO;

public interface UserService {
    UserDTO registerUser(UserRegistrationDTO userRegistrationDTO);
}