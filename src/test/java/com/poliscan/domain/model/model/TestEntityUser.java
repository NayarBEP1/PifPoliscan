package com.poliscan.domain.model.model;

import com.poliscan.domain.databuilder.UserDataBuilder;
import com.poliscan.domain.model.entity.User;
import com.poliscan.domain.exceptions.ExceptionGeneral;
import org.junit.jupiter.api.Test;

import static com.poliscan.domain.model.utils.EntityUserUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEntityUser {
    private UserDataBuilder dataBuilder = new UserDataBuilder();

    @Test
    public void createUser(){
        User user = dataBuilder.build();
        assertEquals("Brayan", user.getName());
        assertEquals("Estrada", user.getLastName());
        assertEquals("brayan.estrada@ceiba.com.co", user.getEmail());
        assertEquals("password8characters", user.getPass());
    }

    @Test
    public void createUserWithoutName() {
        assertThrows(ExceptionGeneral.class, () -> dataBuilder.userWithName(null).build(), ERROR_NAME_IS_MANDATORY);
    }

    @Test
    public void createUserWithoutLastName() {
        assertThrows(ExceptionGeneral.class, () -> dataBuilder.userWithName(null).build(), ERROR_LAST_NAME_IS_MANDATORY);
    }

    @Test
    public void createUserWithoutEmail() {
        assertThrows(ExceptionGeneral.class, () -> dataBuilder.userWithName(null).build(), ERROR_EMAIL_IS_MANDATORY);
    }

    @Test
    public void createUserWithoutPass() {
        assertThrows(ExceptionGeneral.class, () -> dataBuilder.userWithName(null).build(), ERROR_PASS_IS_MANDATORY);
    }
}
