package com.nur.command.users.list;

import com.nur.command.person.list.GetListPersonsHandler;
import com.nur.command.person.list.GetListPersonsQuery;
import com.nur.dtos.PersonDTO;
import com.nur.dtos.UsersDTO;
import com.nur.model.Personas;
import com.nur.model.Usuario;
import com.nur.repositories.IUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class GetListUsersHandlerTest {
    @Mock
    private IUserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAll() {
        assertDoesNotThrow(() -> {
            List<Usuario> users = new ArrayList<>();
            users.add(new Usuario("Criss", "cristhian@gmail.com", "123456", "Huesped", UUID.randomUUID()));

            when(userRepository.getAll()).thenReturn(users);

            GetListUserQuery query = new GetListUserQuery();
            GetListUsersHandler handler = new GetListUsersHandler(userRepository);

            List<UsersDTO> response = handler.handle(query);
            assertNotNull(response);
        });
    }

    @Test
    void testGetAllException() {
        when(userRepository.getAll()).thenThrow(new RuntimeException("ERROR"));
        RuntimeException actual = assertThrows(RuntimeException.class, () -> {
            GetListUserQuery query = new GetListUserQuery();
            GetListUsersHandler handler = new GetListUsersHandler(userRepository);
            List<UsersDTO> response = handler.handle(query);
        });
        assertNotNull(actual);
        assertEquals("java.lang.RuntimeException: ERROR", actual.getMessage());
    }
}