package com.poliscan.domain.service.user;

import com.poliscan.domain.databuilder.UserDataBuilder;
import com.poliscan.domain.model.entity.User;
import com.poliscan.domain.port.repository.RepositoryUser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceCreateUser {

    private RepositoryUser repositoryUser = Mockito.mock(RepositoryUser.class);
    private UserDataBuilder userDataBuilder = new UserDataBuilder();

    @Test
    public void createUser() {
        // Arrange
        User user = userDataBuilder.build();
        Mockito.when(this.repositoryUser.createUser(user)).thenReturn(user);
        ServiceCreateUser serviceCreateUser = new ServiceCreateUser(repositoryUser);

        // Act
        User userSaved = serviceCreateUser.run(user);

        // Assert
        assertEquals(user.getName(), userSaved.getName());
        assertEquals(user.getLastName(), userSaved.getLastName());
        assertEquals(user.getEmail(), userSaved.getEmail());
    }
}
