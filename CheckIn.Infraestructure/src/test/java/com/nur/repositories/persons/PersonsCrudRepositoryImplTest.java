package com.nur.repositories.persons;

import com.nur.builder.PersonsBuilder;
import com.nur.model.Personas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class PersonsCrudRepositoryImplTest {
    @Mock
    IPersonsCrudRepository personsCrudRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testUpdate() {
        assertDoesNotThrow(() -> {
            Personas person = new PersonsBuilder();
        });
    }
}