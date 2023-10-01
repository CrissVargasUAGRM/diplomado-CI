package com.nur.command.commend.list;

import com.nur.dtos.CommendDTO;
import com.nur.dtos.CommendPersonDTO;
import com.nur.model.Commend;
import com.nur.model.CommendPerson;
import com.nur.repositories.ICommendPersonRepository;
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

class GetListCommendPersonHandlerTest {
    @Mock
    private ICommendPersonRepository commendRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAll() {
        assertDoesNotThrow(() -> {
            List<CommendPerson> commends = new ArrayList<>();
            commends.add(new CommendPerson(UUID.randomUUID(), "Bueno", "loq que sea", "Cristhian", 3));

            when(commendRepository.getAll()).thenReturn(commends);

            GetListCommendPersonQuery query = new GetListCommendPersonQuery();
            GetListCommendPersonHandler handler = new GetListCommendPersonHandler(commendRepository);

            List<CommendPersonDTO> response = handler.handle(query);
            assertNotNull(response);
        });
    }

    @Test
    void testGetAllException() {
        when(commendRepository.getAll()).thenThrow(new RuntimeException("ERROR"));
        RuntimeException actual = assertThrows(RuntimeException.class, () -> {
            GetListCommendPersonQuery query = new GetListCommendPersonQuery();
            GetListCommendPersonHandler handler = new GetListCommendPersonHandler(commendRepository);
            List<CommendPersonDTO> response = handler.handle(query);
        });
        assertNotNull(actual);
        assertEquals("java.lang.RuntimeException: ERROR", actual.getMessage());
    }
}