package com.nur.model;

import com.nur.core.BusinessRuleValidationException;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CommendPersonTest {
    @Test
    void testCheckCreateCommend() throws BusinessRuleValidationException {
        UUID userId = UUID.randomUUID();
        CommendPerson commend = new CommendPerson(
                UUID.fromString(String.valueOf(userId)),
                "Buena",
                "lo que sea",
                "Cristhian",
                3
        );
        commend.setUserId(userId);
        assertEquals("Buena", commend.getValoration());
        assertEquals("lo que sea", commend.getCommend());
        assertEquals("Cristhian", commend.getPerson());
        assertEquals(3, commend.getPoints());
        assertNotNull(commend.getUserId());
        assertNotNull(commend.getId());
    }
}