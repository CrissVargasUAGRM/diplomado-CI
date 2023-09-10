package com.nur.controllers;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Pipeline;
import builder.PersonDTOBuilder;
import builder.UsersDTOBuilder;
import com.nur.dtos.PersonDTO;
import com.nur.dtos.UsersDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

class UserControllersTest {
    @Mock
    Pipeline pipeline;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testControllerCreateUser() {
        UsersDTO user = new UsersDTOBuilder().build();

        when(pipeline.send((Command<Object>) anyObject())).thenReturn(user);

        UserControllers usersController = new UserControllers(pipeline);

        UsersDTO userController = usersController.createUser(user);
        assertNotNull(usersController);
    }

    @Test
    void testGetUserController(){
        UsersDTO user = new UsersDTOBuilder().build();

        when(pipeline.send((Command<Object>) anyObject())).thenReturn(user);

        UserControllers usersController = new UserControllers(pipeline);
        UsersDTO response = usersController.getById(UUID.randomUUID());
        assertNotNull(response);
    }

    @Test
    void testGetAll() {
        List<UsersDTO> users = new ArrayList<>();
        users.add(new UsersDTOBuilder().build());

        when(pipeline.send((Command<Object>) anyObject())).thenReturn(users);

        UserControllers usersController = new UserControllers(pipeline);
        List<UsersDTO> response = usersController.getAllUsers();
        assertNotNull(response);
    }
}