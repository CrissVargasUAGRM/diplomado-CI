package com.nur.model;

import com.nur.core.BusinessRuleValidationException;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    void testToCheckCreateUser() throws BusinessRuleValidationException {
        UUID personId = UUID.randomUUID();
        Usuario user = new Usuario("Cristhian", "cristhian_086@gmail.com", "1234567", "Huesped", personId);
        assertEquals("Cristhian", user.getUsername());
        assertEquals("cristhian_086@gmail.com", user.getEmail());
        assertEquals("1234567", user.getPass());
        assertEquals("Huesped", user.getAccountType());
        assertEquals(personId, user.getPersonId());
    }

    /*@Test
    void testToCheckCreateUserEmpty() throws BusinessRuleValidationException {
        Exception exception = assertThrows(
                NullPointerException.class,
                () -> {
                    Usuario user = new Usuario();
                    assertEquals(null, user.getPersonId());
                }
        );
        System.out.println(exception.getMessage());
    }*/
}