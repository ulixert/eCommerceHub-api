package com.ulixert.ecommercehub.service;

import com.ulixert.ecommercehub.model.User;
import jakarta.validation.Valid;

public interface UserService {
    User registerUser(@Valid User user);
}