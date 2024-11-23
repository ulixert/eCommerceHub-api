package com.ulixert.ecommercehub.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ulixert.ecommercehub.dto.UserDTO.UserDTO;
import com.ulixert.ecommercehub.dto.UserDTO.UserRegistrationDTO;
import com.ulixert.ecommercehub.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AuthController.class)
class AuthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Autowired
    private ObjectMapper objectMapper; // For converting objects to JSON

    @Test
    void testSignup() throws Exception {
        UserRegistrationDTO registrationDTO = new UserRegistrationDTO();
        registrationDTO.setName("Charlie");
        registrationDTO.setEmail("charlie@example.com");
        registrationDTO.setPassword("password");

        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setName("Charlie");
        userDTO.setEmail("charlie@example.com");

        when(userService.registerUser(any(UserRegistrationDTO.class))).thenReturn(userDTO);

        mockMvc.perform(post("/api/auth/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(registrationDTO)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(userDTO.getId()))
                .andExpect(jsonPath("$.email").value(userDTO.getEmail()));

        verify(userService).registerUser(any(UserRegistrationDTO.class));
    }
}