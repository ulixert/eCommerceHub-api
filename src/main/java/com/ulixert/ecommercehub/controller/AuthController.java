package com.ulixert.ecommercehub.controller;


import com.ulixert.ecommercehub.dto.UserDTO.UserDTO;
import com.ulixert.ecommercehub.dto.UserDTO.UserRegistrationDTO;
import com.ulixert.ecommercehub.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<UserDTO> signup(@Valid @RequestBody UserRegistrationDTO userRegistrationDTO) {
        UserDTO userDTO = userService.registerUser(userRegistrationDTO);

        URI location = URI.create(String.format("/api/users/%s", userDTO.getId()));
        return ResponseEntity.created(location).body(userDTO);
    }
}