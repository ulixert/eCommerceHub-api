package com.ulixert.ecommercehub.service.impl;

import com.ulixert.ecommercehub.dto.UserDTO.UserDTO;
import com.ulixert.ecommercehub.dto.UserDTO.UserRegistrationDTO;
import com.ulixert.ecommercehub.mapper.UserMapper;
import com.ulixert.ecommercehub.model.User;
import com.ulixert.ecommercehub.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserMapper userMapper;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserServiceImpl userService;

    private UserRegistrationDTO registrationDTO;
    private User user;
    private UserDTO userDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        registrationDTO = new UserRegistrationDTO();
        registrationDTO.setName("John Doe");
        registrationDTO.setEmail("john@example.com");
        registrationDTO.setPassword("password123");

        user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("john@example.com");
        user.setPassword("encodedPassword");

        userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setName("John Doe");
        userDTO.setEmail("john@example.com");
    }

    @Test
    void testRegisterUser_Success() {
        when(userRepository.findByEmail(registrationDTO.getEmail())).thenReturn(Optional.empty());
        when(userMapper.toUser(registrationDTO)).thenReturn(user);
        when(passwordEncoder.encode(registrationDTO.getPassword())).thenReturn("encodedPassword");
        when(userRepository.save(any(User.class))).thenReturn(user);
        when(userMapper.toUserDTO(user)).thenReturn(userDTO);

        UserDTO result = userService.registerUser(registrationDTO);

        assertNotNull(result);
        assertEquals(userDTO.getId(), result.getId());
        assertEquals(userDTO.getEmail(), result.getEmail());

        verify(userRepository).findByEmail(registrationDTO.getEmail());
        verify(passwordEncoder).encode(registrationDTO.getPassword());
        verify(userRepository).save(user);
        verify(userMapper).toUserDTO(user);
    }

    @Test
    void testRegisterUser_EmailAlreadyExists() {
        when(userRepository.findByEmail(registrationDTO.getEmail())).thenReturn(Optional.of(user));

        Exception exception = assertThrows(RuntimeException.class, () -> {
            userService.registerUser(registrationDTO);
        });

        assertEquals("Email is already in use", exception.getMessage());

        verify(userRepository).findByEmail(registrationDTO.getEmail());
        verifyNoMoreInteractions(userRepository);
        verifyNoInteractions(passwordEncoder);
        verifyNoInteractions(userMapper);
    }
}