package com.nur.command.commend.list;

import com.nur.command.users.list.GetListUserQuery;
import com.nur.command.users.list.GetListUsersHandler;
import com.nur.dtos.CommendDTO;
import com.nur.dtos.UsersDTO;
import com.nur.model.Commend;
import com.nur.model.Usuario;
import com.nur.repositories.ICommendRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class GetListCommendHandlerTest {
    @Mock
    private ICommendRepository commendRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAll() {
        assertDoesNotThrow(() -> {
            List<Commend> commends = new ArrayList<>();
            commends.add(new Commend(UUID.randomUUID(), "Bueno", "loq que sea", "Condominio", 3));

            when(commendRepository.getAll()).thenReturn(commends);

            GetListCommendQuery query = new GetListCommendQuery();
            GetListCommendHandler handler = new GetListCommendHandler(commendRepository);

            List<CommendDTO> response = handler.handle(query);
            assertNotNull(response);
        });
    }

    @Test
    void testGetAllException() {
        when(commendRepository.getAll()).thenThrow(new RuntimeException("ERROR"));
        RuntimeException actual = assertThrows(RuntimeException.class, () -> {
            GetListCommendQuery query = new GetListCommendQuery();
            GetListCommendHandler handler = new GetListCommendHandler(commendRepository);
            List<CommendDTO> response = handler.handle(query);
        });
        assertNotNull(actual);
        assertEquals("java.lang.RuntimeException: ERROR", actual.getMessage());
    }
}