package com.nur.command.commend.get;

import builder.CommendDTOBuilder;
import builder.CommendPersonDTOBuilder;
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

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

class GetCommendPersonHandlerTest {
    @Mock
    private ICommendPersonRepository commendRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    /*@Test
    void testCreateHandler() {
        assertDoesNotThrow(() -> {
            CommendPersonDTO commendJpa = new CommendPersonDTOBuilder().build();
            CommendPerson commendDomain = new CommendPerson(UUID.randomUUID(), "Bueno", "Lo que sea", "Cristhian", 3);
            GetCommendPersonQuery query = new GetCommendPersonQuery(String.valueOf(UUID.randomUUID()));

            when(commendRepository.getById(any())).thenReturn(commendDomain);

            GetCommendPersonHandler handler = new GetCommendPersonHandler(commendRepository);

            CommendPersonDTO response = handler.handle(query);

            assertNotNull(response);
            assertEquals(commendJpa.getValoration(), response.getValoration());
            assertEquals(commendJpa.getDescription(), response.getDescription());
            assertEquals(commendJpa.getPerson(), response.getPerson());
            assertEquals(commendJpa.getPoints(), response.getPoints());
            assertNotNull(response.getUserId());
        });
    }*/
}